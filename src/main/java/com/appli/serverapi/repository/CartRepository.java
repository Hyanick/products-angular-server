package com.appli.serverapi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.appli.serverapi.model.Cart;

public interface CartRepository extends JpaRepository<Cart, Long> {
	@Query("SELECT new Cart  (productId, SUM(price), SUM(quantity)) FROM Cart group by productId")
	List<Cart> listCartsJPQL();

}
