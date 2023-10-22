package com.sb.foodsystem.model;



import com.sb.foodsystem.entity.Menu;
import com.sb.foodsystem.entity.Order;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class OrderDetailsDTO {
	
	private Long orderDetails_Id;
	private Order order;
	private Menu menu;
	private float amount;
	private float totalAmount;
	private int quantity;

}
