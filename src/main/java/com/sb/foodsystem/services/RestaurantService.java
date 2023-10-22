package com.sb.foodsystem.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sb.foodsystem.dao.RestaurantRepository;
import com.sb.foodsystem.entity.Restaurant;

@Service
public class RestaurantService {

	    @Autowired
	    private RestaurantRepository restaurantRepository;

	    public RestaurantService(RestaurantRepository restaurantRepository) 
	    {
	        this.restaurantRepository = restaurantRepository;
	    }

	    // Save a new restaurant
	    public Restaurant saveRestaurant(Restaurant restaurant) 
	    {
	        return restaurantRepository.save(restaurant);
	    }

	    // Retrieve all restaurants
	    public List<Restaurant> getAllRestaurants()
	    {
	        return restaurantRepository.findAll();
	    }

	    // Get a restaurant by ID
	    public Optional<Restaurant> getRestaurantById(Long id) 
	    {
	        return restaurantRepository.findById(id);
	    }

	    // Update a restaurant
	    public Restaurant updateRestaurant(Restaurant restaurant) 
	    {
	        return restaurantRepository.save(restaurant);
	    }

	    


}
