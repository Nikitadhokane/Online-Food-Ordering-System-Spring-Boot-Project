package com.sb.foodsystem.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.sb.foodsystem.entity.MenuType;
import com.sb.foodsystem.entity.User;

public interface MenuTypeRepository extends JpaRepository<MenuType,Long> 
{
	MenuType findByUser(User user);

}
