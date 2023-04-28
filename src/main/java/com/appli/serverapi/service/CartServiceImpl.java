package com.appli.serverapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.appli.serverapi.model.Cart;
import com.appli.serverapi.repository.CartRepository;

@Service
public class CartServiceImpl implements CartService {
	private CartRepository cartRepository;
	
	@Autowired
	public CartServiceImpl(CartRepository cartRepository) {
		this.cartRepository = cartRepository;
	}

	@Override
	public List<Cart> listCarts() {
		List<Cart> carts = cartRepository.listCartsJPQL();
		return carts;
	}

}
