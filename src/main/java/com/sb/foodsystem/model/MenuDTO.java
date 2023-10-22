package com.sb.foodsystem.model;

import com.sb.foodsystem.entity.MenuType;
import com.sb.foodsystem.entity.Restaurant;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MenuDTO {
	
	private Long id;
	private String item;
	private int price;
	private int quantity;
	private MenuType menuType;
	private Restaurant restaurant;
	

}
