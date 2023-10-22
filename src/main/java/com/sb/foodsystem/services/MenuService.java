package com.sb.foodsystem.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sb.foodsystem.dao.MenuRepository;
import com.sb.foodsystem.entity.Menu;

@Service
public class MenuService {
	
	@Autowired
	private MenuRepository menuRepository;
	
	public MenuService(MenuRepository menuRepository)
	{
		this.menuRepository= menuRepository;
	}
	
	// Save a new menu
    public Menu saveMenu(Menu menu) 
    {
        return menuRepository.save(menu);
    }

    // Get all menus
    public List<Menu> getAllMenus()
    {
        return menuRepository.findAll();
    }

    // Get a menu by ID
    public Optional<Menu> getMenuById(Long menuId)
    {
        return menuRepository.findById(menuId);
    }

    // Update a menu
    public Menu updateMenu(Menu menu) {
        return menuRepository.save(menu);
    }

    // Delete a menu
    public void deleteMenu(Long menuId) 
    {
        menuRepository.deleteById(menuId);
    }
	
	

}
