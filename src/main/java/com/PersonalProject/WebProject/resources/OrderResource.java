package com.PersonalProject.WebProject.resources;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.PersonalProject.WebProject.entities.Order;
import com.PersonalProject.WebProject.services.OrderService;

@RestController
@RequestMapping(value = "/orders")
public class OrderResource {

	private OrderService service;
	
	public ResponseEntity<List<Order>> findAll() {
		List<Order> orderList = service.findAll();
		return ResponseEntity.ok().body(orderList);
	}
}
