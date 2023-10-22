package com.sb.foodsystem.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RestaurantDTO {
	
	private Long id;
	private String name;
	private String address;
	private String contact;
	private String email;
	private String openingHours;

}
