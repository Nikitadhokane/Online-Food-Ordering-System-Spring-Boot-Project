package com.sb.foodsystem.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sb.foodsystem.converter.MenuConverter;
import com.sb.foodsystem.dao.MenuRepository;
import com.sb.foodsystem.entity.Menu;
import com.sb.foodsystem.model.MenuDTO;
import com.sb.foodsystem.service.MenuService;

@Service
public class MenuServiceImpl implements MenuService {

	@Autowired
    private MenuRepository menuRepository;
	
	@Autowired
    private MenuConverter menuConverter;

    public MenuServiceImpl(MenuRepository menuRepository, MenuConverter menuConverter)
    {
        this.menuRepository = menuRepository;
        this.menuConverter = menuConverter;
    }

    @Override
    public MenuDTO createMenu(MenuDTO menuDTO) 
    {
        Menu menu = menuConverter.dtoToEntity(menuDTO);
        menu = menuRepository.save(menu);
        return menuConverter.entityToDto(menu);
    }

    @Override
    public MenuDTO getMenuById(Long id) 
    {
        Menu menu = menuRepository.findById(id).orElse(null);
        return menuConverter.entityToDto(menu);
    }

    @Override
    public MenuDTO updateMenu(Long id, MenuDTO menuDTO) 
    {
        Menu menu = menuConverter.dtoToEntity(menuDTO);
        menu.setId(id); // Assuming id is part of the MenuDTO
        menu = menuRepository.save(menu);
        return menuConverter.entityToDto(menu);
    }

    @Override
    public String deleteMenu(Long id)
    {
        menuRepository.deleteById(id);
        return "Menu with ID " + id + " has been deleted successfully.";
    }
}