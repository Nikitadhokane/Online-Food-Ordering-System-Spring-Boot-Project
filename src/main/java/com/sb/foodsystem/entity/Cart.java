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
@Table(name="Cart_Details")
public class Cart {
	
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	
	@Column(name="Cart_Id")
	private Long cartId;
	
	@Column(name="Quantity")
	private int quantity;
	
	@ManyToOne
	@JoinColumn(name="user_id")
	private User user;
	
	@ManyToOne
	@JoinColumn(name="menu_id")
	private Menu menu;
	
}
	
	
	
	
    