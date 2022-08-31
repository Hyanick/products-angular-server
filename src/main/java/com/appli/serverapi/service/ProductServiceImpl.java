package com.appli.serverapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.appli.serverapi.model.Product;
import com.appli.serverapi.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {
	
	private ProductRepository productRepository;
	
	@Autowired
	public ProductServiceImpl(ProductRepository productRepository) {
		this.productRepository = productRepository;
	}

	
	@Override
	public List<Product> searchProducts(String query, int limitResult) {
		// TODO Auto-generated method stub
		List<Product> products = productRepository.searchProductsSQL(query, limitResult);
		return products;
	}

	/* Utilisation de JPQL
	@Override
	public List<Product> searchProducts(String query) {
		// TODO Auto-generated method stub
		List<Product> products = productRepository.searchProductsJPQL(query);
		return products;
	}
	*/
	

}
