package com.sb.foodsystem.model;


import java.util.Date;

import com.sb.foodsystem.entity.Restaurant;
import com.sb.foodsystem.entity.User;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class OrderDTO {
	
	private Long order_id;
	private User user;
	private Restaurant restaurant;
	private Date orderDate;
	private int totalAmount;
	private Long userId;
	private String status;

}
