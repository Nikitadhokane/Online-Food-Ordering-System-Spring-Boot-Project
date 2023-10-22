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

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Order_Details")
public class OrderDetails {
	
	 @Id
	    @GeneratedValue(strategy=GenerationType.IDENTITY)
	 
	    @Column(name = "Order_Details_ID")
	    private Long order_Details_Id;

	    @ManyToOne
	    @JoinColumn(name = "Order_ID")
	    private Order order;

	    @ManyToOne
	    @JoinColumn(name = "Menu_ID")
	    private Menu menu;

	    @Column(name = "Amount")
	    private Float amount;

	    @Column(name = "Total_Amount")
	    private Float totalAmount;

	    @Column(name = "Quantity")
	    private Integer quantity;

}
