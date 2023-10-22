package com.sb.foodsystem.model;

import com.sb.foodsystem.entity.Menu;
import com.sb.foodsystem.entity.Restaurant;
import com.sb.foodsystem.entity.User;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ReviewDTO {
	
	private int reviewId;
	private User user;
	private Restaurant restaurant;
	private Menu menu;
	private int rating;
	private String comment;
	
	
	

}
