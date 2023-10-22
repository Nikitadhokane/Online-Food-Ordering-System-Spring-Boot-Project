package com.sb.foodsystem.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sb.foodsystem.dao.MenuTypeRepository;
import com.sb.foodsystem.entity.MenuType;


@Service
public class MenuTypeService {
	
	@Autowired
	private MenuTypeRepository menuTypeRepository;
	public MenuTypeService(MenuTypeRepository menuTypeRepository)
	{
		this.menuTypeRepository=menuTypeRepository;
	}
	
	public List<MenuType> getAllMenuTypes()
	{
		return menuTypeRepository.findAll();
	}
	
	public Optional<MenuType> getMenuTypeById(Long id)
	{
		return menuTypeRepository.findById(id);
	}
	
	public MenuType createMenuType(MenuType menuType)
	{
		return menuTypeRepository.save(menuType);
	}
	
	public MenuType updateMenuType(MenuType menuType)
	{
		return menuTypeRepository.save(menuType);
	}
	

}
