package com.appli.serverapi.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.appli.serverapi.model.Cart;
import com.appli.serverapi.repository.CartRepository;
import com.appli.serverapi.service.CartService;

@RestController
@CrossOrigin("*")
@RequestMapping("/carts")
public class CartController {
	@Autowired
	private CartRepository cartRepository;
	
	@Autowired
	private CartService cartService;
	
	@GetMapping
	public List<Cart> getCarts(){
		return cartRepository.findAll();
	} 
	
	@GetMapping("/list")
	public ResponseEntity<List<Cart>> getAllCartsBySQL() {
		return ResponseEntity.ok(cartService.listCarts());
		
	}
	
	
	@PostMapping
	public Cart save(@RequestBody Cart cart) throws IOException {
		return cartRepository.save(cart); 
	}

}
