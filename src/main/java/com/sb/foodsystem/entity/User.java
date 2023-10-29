package com.sb.foodsystem.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;
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
@Table(name="Registration")
@Inheritance(strategy = InheritanceType.JOINED)
public class User {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	@Column(name="User_Id")
	private Long userId;
	
	@OneToMany(mappedBy = "user")
	private List<MenuType> menuTypes;
	
	@Column(name="Password")
    private String password;
	
	@Column(name="UserName")
    private String userName;
	
	@Column(name="Email")
    private String email;
	
	@Column(name="Address")
    private String address;
	
	@Column(name="Contact")
    private Integer contact;
    
    
	
	
	
	
    
    
   

}
