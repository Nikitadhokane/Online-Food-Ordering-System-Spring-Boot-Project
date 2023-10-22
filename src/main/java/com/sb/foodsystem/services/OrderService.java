package com.sb.foodsystem.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sb.foodsystem.dao.OrderRepository;
import com.sb.foodsystem.entity.Order;

@Service
public class OrderService {
	
	@Autowired
	private OrderRepository orderRepository;
	
	public OrderService(OrderRepository orderRepository)
	{
		this.orderRepository=orderRepository;
	}
	
	//save a new order
	public Order saveOrder(Order order)
	{
		return orderRepository.save(order);
	}
	
	//Get all orders
	public List<Order> getAllOrders()
	{
		return orderRepository.findAll();
	}
	
	//Get an order by id
	public Optional<Order> getOrderById(Long orderId)
	{
		return orderRepository.findById(orderId);
		
	}
	
	//update an order
	public Order updateOrder(Order order)
	{
		return orderRepository.save(order);
	}
	
	
	
	
	

}