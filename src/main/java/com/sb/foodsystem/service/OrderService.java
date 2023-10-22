package com.sb.foodsystem.service;

import com.sb.foodsystem.model.OrderDTO;

public interface OrderService {

    OrderDTO createOrder(OrderDTO orderDTO);

    OrderDTO getOrderById(Long id);

    OrderDTO updateOrder(Long id, OrderDTO orderDTO);

    String deleteOrder(Long id);
}