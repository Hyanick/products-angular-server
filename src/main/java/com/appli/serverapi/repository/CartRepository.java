package com.appli.serverapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.appli.serverapi.model.Cart;

public interface CartRepository extends JpaRepository<Cart, Long> {

}
