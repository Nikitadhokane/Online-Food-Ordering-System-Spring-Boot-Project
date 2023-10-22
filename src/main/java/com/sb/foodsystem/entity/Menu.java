package com.sb.foodsystem.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
@Entity
@Table(name="Menu_Table")
public class Menu{
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	@Column(name="Menu_Id")
    private Long id;
	
	@Column(name="Menu_Name")
    private String item;
	
	@Column(name="Price")
    private int price;
	
	@Column(name="Quantity")
    private int quantity;
	
	@ManyToOne
	@JoinColumn(name = "menu_type_id")
	private MenuType menuType;
	
	@ManyToOne
	@JoinColumn(name = "restaurant_id")
	private Restaurant restaurant;

    
	
	
    
    
    
    
   

}
