package com.sb.foodsystem.dao;

import org.springframework.data.jpa.repository.JpaRepository;


import com.sb.foodsystem.entity.Menu;



public interface MenuRepository  extends JpaRepository<Menu,Long> 
{
	
	Menu findMenuById(Long id);

}
