package com.appli.serverapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.appli.serverapi.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
