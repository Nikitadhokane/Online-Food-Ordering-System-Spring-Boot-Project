package com.sb.foodsystem.controller;

import java.util.List;

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

import com.sb.foodsystem.entity.MenuType;
import com.sb.foodsystem.services.MenuTypeService;

@RestController
@RequestMapping("/menu_types")
public class MenuTypeController {
	
	@Autowired
	private MenuTypeService menuTypeService;
	
	public MenuTypeController(MenuTypeService menuTypeService)
	{
		this.menuTypeService=menuTypeService;
	}
	
	@GetMapping
	public ResponseEntity<List<MenuType>> getAllMenuTypes()
	{
		return ResponseEntity.ok(menuTypeService.getAllMenuTypes());
	}
	
	@GetMapping("{id}")
	public ResponseEntity<MenuType> getMenuTypeById(@PathVariable Long id)
	{
		return menuTypeService.getMenuTypeById(id).map(menuType -> new ResponseEntity<>(menuType, HttpStatus.OK))
				.orElseGet(()-> new ResponseEntity<>(HttpStatus.NOT_FOUND));
	}
	
	@PostMapping
	public ResponseEntity<MenuType> createMenuType(@RequestBody MenuType menuType)
	{
		return new ResponseEntity<>(menuTypeService.createMenuType(menuType), HttpStatus.CREATED);
	}
	
	@PutMapping("{id}")
	public ResponseEntity<MenuType> updateMenuType(@PathVariable Long id, @RequestBody MenuType menuType)
	{
		if(!menuTypeService.getMenuTypeById(id).isPresent())
		{
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		menuType.setId(id);
		MenuType updatedMenuType=menuTypeService.updateMenuType(menuType);
		return new ResponseEntity<>(updatedMenuType, HttpStatus.OK);
	}
	
	
	
	
	
	

}
