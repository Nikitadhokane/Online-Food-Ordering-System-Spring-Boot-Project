package com.sb.foodsystem.converter;

import org.springframework.stereotype.Component;

import com.sb.foodsystem.entity.Menu;
import com.sb.foodsystem.model.MenuDTO;

@Component
public class MenuConverter {

    public MenuDTO entityToDto(Menu menu) {
        MenuDTO menuDTO = new MenuDTO();
        menuDTO.setId(menu.getId());
        menuDTO.setItem(menu.getItem());
        menuDTO.setPrice(menu.getPrice());
        menuDTO.setQuantity(menu.getQuantity());
        menuDTO.setMenuType(menu.getMenuType());
        menuDTO.setRestaurant(menu.getRestaurant());
        return menuDTO;
    }

    public Menu dtoToEntity(MenuDTO menuDTO) {
        Menu menu = new Menu();
        menu.setId(menuDTO.getId());
        menu.setItem(menuDTO.getItem());
        menu.setPrice(menuDTO.getPrice());
        menu.setQuantity(menuDTO.getQuantity());
        menu.setMenuType(menuDTO.getMenuType());
        menu.setRestaurant(menuDTO.getRestaurant());
        return menu;
    }
}