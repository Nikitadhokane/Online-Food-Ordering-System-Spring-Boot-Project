package com.sb.foodsystem.model;

import com.sb.foodsystem.entity.User;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LoginDTO {
	
	private Long id;
	private String username;
	private String password;
	private User user;

}
