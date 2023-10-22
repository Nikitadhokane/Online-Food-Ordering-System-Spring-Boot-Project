package com.sb.foodsystem.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sb.foodsystem.converter.OrderConverter;
import com.sb.foodsystem.dao.OrderRepository;
import com.sb.foodsystem.entity.Order;
import com.sb.foodsystem.model.OrderDTO;
import com.sb.foodsystem.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
    private OrderRepository orderRepository;
	
	@Autowired
    private OrderConverter orderConverter;

    public OrderServiceImpl(OrderRepository orderRepository, OrderConverter orderConverter) 
    {
        this.orderRepository = orderRepository;
        this.orderConverter = orderConverter;
    }

    @Override
    public OrderDTO createOrder(OrderDTO orderDTO) 
    {
        Order order = orderConverter.dtoToEntity(orderDTO);
        order = orderRepository.save(order);
        return orderConverter.entityToDto(order);
    }

    @Override
    public OrderDTO getOrderById(Long id) 
    {
        Order order = orderRepository.findById(id).orElse(null);
        return orderConverter.entityToDto(order);
    }

    @Override
    public OrderDTO updateOrder(Long id, OrderDTO orderDTO) 
    {
        Order order = orderConverter.dtoToEntity(orderDTO);
        order.setUserId(id); // Assuming id is part of the OrderDTO
        order = orderRepository.save(order);
        return orderConverter.entityToDto(order);
    }

    @Override
    public String deleteOrder(Long id) 
    {
        orderRepository.deleteById(id);
        return "Order with ID " + id + " has been deleted successfully.";
    }
}