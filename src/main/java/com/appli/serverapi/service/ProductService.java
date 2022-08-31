package com.appli.serverapi.service;
import com.appli.serverapi.model.Product;
import java.util.List;
public interface ProductService {
	List<Product> searchProducts(String query, int limitResult);

}
