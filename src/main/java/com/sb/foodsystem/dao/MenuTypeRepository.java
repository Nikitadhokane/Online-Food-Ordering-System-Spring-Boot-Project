package com.sb.foodsystem.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.sb.foodsystem.entity.MenuType;

public interface MenuTypeRepository extends JpaRepository<MenuType,Long> 
{
	MenuType findByuserId(Long id);

}
