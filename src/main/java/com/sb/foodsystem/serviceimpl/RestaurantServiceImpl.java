package com.sb.foodsystem.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sb.foodsystem.converter.RestaurantConverter;
import com.sb.foodsystem.dao.RestaurantRepository;
import com.sb.foodsystem.entity.Restaurant;
import com.sb.foodsystem.model.RestaurantDTO;
import com.sb.foodsystem.service.RestaurantService;

@Service
public class RestaurantServiceImpl implements RestaurantService {

	@Autowired
    private RestaurantRepository restaurantRepository;
	
	@Autowired
    private RestaurantConverter restaurantConverter;

    
    public RestaurantServiceImpl(RestaurantRepository restaurantRepository, RestaurantConverter restaurantConverter)
    {
        this.restaurantRepository = restaurantRepository;
        this.restaurantConverter = restaurantConverter;
    }

    @Override
    public RestaurantDTO createRestaurant(RestaurantDTO restaurantDTO)
    {
        Restaurant restaurant = restaurantConverter.dtoToEntity(restaurantDTO);
        restaurant = restaurantRepository.save(restaurant);
        return restaurantConverter.entityToDto(restaurant);
    }

    @Override
    public RestaurantDTO getRestaurantById(Long id)
    {
        Restaurant restaurant = restaurantRepository.findById(id).orElse(null);
        return restaurantConverter.entityToDto(restaurant);
    }

    @Override
    public RestaurantDTO updateRestaurant(Long id, RestaurantDTO restaurantDTO) 
    {
        Restaurant restaurant = restaurantConverter.dtoToEntity(restaurantDTO);
        restaurant.setId(id); // Assuming id is part of the RestaurantDTO
        restaurant = restaurantRepository.save(restaurant);
        return restaurantConverter.entityToDto(restaurant);
    }

    @Override
    public String deleteRestaurant(Long id)
    {
        restaurantRepository.deleteById(id);
        return "Restaurant with ID " + id + " has been deleted successfully.";
    }
}