package com.sb.foodsystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sb.foodsystem.entity.Order;
import com.sb.foodsystem.services.OrderService;

@RestController
@RequestMapping("/orders")
public class OrderController {
	
	@Autowired
	private OrderService orderService; 
	
	public OrderController(OrderService orderService)
	{
		this.orderService=orderService;
	}
	
	@GetMapping
	public List<Order> getAllOrders()
	{
		return orderService.getAllOrders();
	}
	
	@GetMapping("/{orderId}")
	public Order getOrderById(@PathVariable Long orderId)
	{
		return orderService.getOrderById(orderId)
				.orElseThrow(() -> new RuntimeException("Order not found with Id:" + orderId));
	}
	
	@PostMapping
	public Order createOrder(@RequestBody Order order)
	{
		return orderService.saveOrder(order);
	}
	
	@PutMapping("/{orderId")
	public Order updateOrder(@PathVariable Long orderId, @RequestBody Order order)
	{
		if(orderService.getOrderById(orderId).isPresent())
		{
			order.setOrder_id(orderId);
			return orderService.updateOrder(order);
		}
		else
		{
			throw new RuntimeException("Order not found with Id:"+ orderId);
		}
	}

}
