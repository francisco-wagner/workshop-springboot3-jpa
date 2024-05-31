package com.PersonalProject.WebProject.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.PersonalProject.WebProject.entities.Order;
import com.PersonalProject.WebProject.repositories.OrderRepository;

@Component
public class OrderService {

	@Autowired
	private OrderRepository repository;
	
	public List<Order> findAll() {
		return repository.findAll();
	}
}
