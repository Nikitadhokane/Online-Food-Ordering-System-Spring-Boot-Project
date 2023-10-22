package com.sb.foodsystem.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sb.foodsystem.entity.Menu;
import com.sb.foodsystem.services.MenuService;

@RestController
@RequestMapping("/menus")
public class MenuController {
	
	@Autowired
	private MenuService menuService;
	
	public MenuController (MenuService menuService)
	{
		this.menuService=menuService;
	}
	
	@GetMapping
    public List<Menu> getAllMenus() 
	{
        return menuService.getAllMenus();
    }

    @GetMapping("/{menuId}")
    public Menu getMenuById(@PathVariable Long menuId)
    {
        return menuService.getMenuById(menuId)
                .orElseThrow(() -> new RuntimeException("Menu not found with id: " + menuId));
    }

    @PostMapping
    public Menu createMenu(@RequestBody Menu menu) 
    {
        return menuService.saveMenu(menu);
    }

    @PutMapping("/{menuId}")
    public Menu updateMenu(@PathVariable Long menuId, @RequestBody Menu menu) 
    {
        if (menuService.getMenuById(menuId).isPresent())
        {
            menu.setId(menuId);
            return menuService.updateMenu(menu);
        } 
        else
        {
            throw new RuntimeException("Menu not found with id: " + menuId);
        }
    }

			
		
	

}
