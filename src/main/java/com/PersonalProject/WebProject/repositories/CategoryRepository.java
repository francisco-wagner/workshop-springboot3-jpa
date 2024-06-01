package com.PersonalProject.WebProject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.PersonalProject.WebProject.entities.Category;


public interface CategoryRepository extends JpaRepository<Category, Long> {
	
}
