package com.PersonalProject.WebProject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.PersonalProject.WebProject.entities.Product;


public interface ProductRepository extends JpaRepository<Product, Long> {
	
}
