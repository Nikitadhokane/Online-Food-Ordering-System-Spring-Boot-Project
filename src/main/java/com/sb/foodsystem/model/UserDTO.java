package com.sb.foodsystem.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserDTO {
	private Long userId;
	private String password;
	private String firstNmae;
	private String lastName;
	private String email;
	private String address;
	private int contact;

}
