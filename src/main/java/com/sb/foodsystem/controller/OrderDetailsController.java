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

import com.sb.foodsystem.entity.OrderDetails;
import com.sb.foodsystem.services.OrderDetailsService;

@RestController
@RequestMapping("/order-details")
public class OrderDetailsController {
	

    @Autowired
    private OrderDetailsService orderDetailsService;
    
    public OrderDetailsController(OrderDetailsService orderDetailsService) 
    {
        this.orderDetailsService = orderDetailsService;
    }

    @GetMapping
    public List<OrderDetails> getAllOrderDetails() 
    {
        return orderDetailsService.getAllOrderDetails();
    }

    @GetMapping("/{orderDetailsId}")
    public OrderDetails getOrderDetailsById(@PathVariable Long orderDetailsId) 
    {
        return orderDetailsService.getOrderDetailsById(orderDetailsId)
                .orElseThrow(() -> new RuntimeException("Order details not found with id: " + orderDetailsId));
    }

    @PostMapping
    public OrderDetails createOrderDetails(@RequestBody OrderDetails orderDetails) 
    {
        return orderDetailsService.saveOrderDetails(orderDetails);
    }

    @PutMapping("/{orderDetailsId}")
    public OrderDetails updateOrderDetails(@PathVariable Long orderDetailsId, @RequestBody OrderDetails orderDetails)
    {
        if (orderDetailsService.getOrderDetailsById(orderDetailsId).isPresent())
        {
            orderDetails.setOrder_Details_Id(orderDetailsId);
            return orderDetailsService.updateOrderDetails(orderDetails);
        }
        else
        {
            throw new RuntimeException("Order details not found with id: " + orderDetailsId);
        }
    }

    

}
