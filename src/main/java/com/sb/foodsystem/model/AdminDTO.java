package com.sb.foodsystem.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AdminDTO {
	
	private Long id;
	private String username;
	private String password;
	private String email;
	private int contact;
	
	
	

}
