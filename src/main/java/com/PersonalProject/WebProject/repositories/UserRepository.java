package com.PersonalProject.WebProject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.PersonalProject.WebProject.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
}
