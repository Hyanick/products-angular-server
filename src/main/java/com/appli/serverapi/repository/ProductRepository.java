package com.appli.serverapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.appli.serverapi.model.Product;
import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {
	@Query("SELECT p FROM Product p WHERE" +
			" p.name LIKE CONCAT('%',:query,'%')" +
			" OR p.description LIKE CONCAT('%',:query,'%') "	)
	List<Product> searchProductsJPQL(String query);
	
	@Query(value = "SELECT * FROM product p WHERE" +
			" p.name LIKE CONCAT('%', :query,'%')" +
			" OR p.description LIKE CONCAT('%',:query,'%') LIMIT :limitResult", nativeQuery = true)
	List<Product> searchProductsSQL(String query, int limitResult);

}
