package com.sb.foodsystem.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
@Table(name="User_Details")
public class User {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	@Column(name="User_Id")
	private Long user_id;
	
	@Column(name="Password")
    private String password;
	
	@Column(name="First_Name")
    private String firstName;
	
	@Column(name="Last_Name")
    private String lastName;
	
	@Column(name="Email")
    private String email;
	
	@Column(name="Address")
    private String address;
	
	@Column(name="Contact")
    private int contact;
    
    
	
	
	
	
    
    
   

}
