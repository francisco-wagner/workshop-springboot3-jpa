package com.PersonalProject.WebProject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.PersonalProject.WebProject.entities.OrderItem;
import com.PersonalProject.WebProject.entities.pk.OrderItemPK;


public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {
	
}
