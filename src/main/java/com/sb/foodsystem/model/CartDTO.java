package com.sb.foodsystem.model;


import com.sb.foodsystem.entity.Menu;
import com.sb.foodsystem.entity.User;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor(staticName="build")
public class CartDTO {
	
	private Long id;
	private int quantity;
	private User user;
	private Menu menu;
	

}
