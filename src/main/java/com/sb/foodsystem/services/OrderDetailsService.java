package com.sb.foodsystem.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sb.foodsystem.dao.OrderDetailsRepository;
import com.sb.foodsystem.entity.OrderDetails;

@Service
public class OrderDetailsService {
	

	    @Autowired
	    private OrderDetailsRepository orderDetailsRepository;
	    
	    public OrderDetailsService(OrderDetailsRepository orderDetailsRepository) 
	    {
	        this.orderDetailsRepository = orderDetailsRepository;
	    }

	    // Save a new order detail
	    public OrderDetails saveOrderDetails(OrderDetails orderDetails)
	    {
	        return orderDetailsRepository.save(orderDetails);
	    }

	    // Get all order details
	    public List<OrderDetails> getAllOrderDetails() 
	    {
	        return orderDetailsRepository.findAll();
	    }

	    // Get an order detail by ID
	    public Optional<OrderDetails> getOrderDetailsById(Long orderDetailsId) 
	    {
	        return orderDetailsRepository.findById(orderDetailsId);
	    }

	    // Update an order detail
	    public OrderDetails updateOrderDetails(OrderDetails orderDetails) 
	    {
	        return orderDetailsRepository.save(orderDetails);
	    }

	    

	

}
