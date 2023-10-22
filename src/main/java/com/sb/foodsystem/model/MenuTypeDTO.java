package com.sb.foodsystem.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MenuTypeDTO {
	
	private Long id;
	private String type_name;
	private String description;

}
