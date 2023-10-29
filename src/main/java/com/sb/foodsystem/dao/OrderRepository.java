package com.sb.foodsystem.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sb.foodsystem.entity.Order;

public interface OrderRepository extends JpaRepository<Order,Long>{
	
	Order findByOrderId(Long orderId);
}
