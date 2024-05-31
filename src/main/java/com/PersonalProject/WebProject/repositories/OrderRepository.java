package com.PersonalProject.WebProject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.PersonalProject.WebProject.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
