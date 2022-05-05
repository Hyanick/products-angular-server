package com.appli.serverapi.controller;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

import com.appli.serverapi.repository.ProductRepository;

import io.swagger.v3.oas.annotations.tags.Tag;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.appli.serverapi.model.Product;

@RestController
@RequestMapping("/products")
public class ProductController {
	@Autowired
	private ProductRepository productRepository;
	
	@GetMapping
	public List<Product> getProducts(){
		return productRepository.findAll();
	} 	
	
	@GetMapping(value = "{id}")
	public Optional<Product> getProduct(@PathVariable Long id){
		return productRepository.findById(id); 		
	}
	
	@PostMapping
	public Product save(@RequestBody Product product) throws IOException {
		return productRepository.save(product); 
	}
	
	@DeleteMapping(value = "{id}")
	public void delete(@PathVariable Long id) {
		productRepository.deleteById(id);		
	}
	
	@PutMapping(value = "{id}")
	public Product update (@PathVariable Long id, @RequestBody Product product) {
		product.setId(id);
		return productRepository.save(product);
	}

}
