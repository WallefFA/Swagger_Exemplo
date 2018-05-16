package com.ais.swagger.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.ais.swagger.model.Product;

@Component
public interface ProductRepository extends JpaRepository<Product, Long>{
	
}
