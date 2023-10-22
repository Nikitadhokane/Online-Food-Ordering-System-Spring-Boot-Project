package com.sb.foodsystem.model;


import java.sql.Time;

import com.sb.foodsystem.entity.Order;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class PaymentDTO {
	
	private Long id;
	private Order order;
	private int amount;
	private Time time;

}
