package com.sb.foodsystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sb.foodsystem.entity.Restaurant;
import com.sb.foodsystem.services.RestaurantService;

@RestController
@RequestMapping("/restaurants")
public class RestaurantController {

	    @Autowired
	    private RestaurantService restaurantService;
	    
	    public RestaurantController(RestaurantService restaurantService) 
	    {
	        this.restaurantService = restaurantService;
	    }

	    @GetMapping
	    public List<Restaurant> getAllRestaurants() 
	    {
	        return restaurantService.getAllRestaurants();
	    }

	    @GetMapping("/{id}")
	    public Restaurant getRestaurantById(@PathVariable Long id)
	    {
	        return restaurantService.getRestaurantById(id)
	                .orElseThrow(() -> new RuntimeException("Restaurant not found with id: " + id));
	    }

	    @PostMapping
	    public Restaurant createRestaurant(@RequestBody Restaurant restaurant) {
	        return restaurantService.saveRestaurant(restaurant);
	    }

	    @PutMapping("/{id}")
	    public Restaurant updateRestaurant(@PathVariable Long id, @RequestBody Restaurant restaurant) 
	    {
	        if (restaurantService.getRestaurantById(id).isPresent())
	        {
	            restaurant.setId(id);
	            return restaurantService.updateRestaurant(restaurant);
	        } 
	        else 
	        {
	            throw new RuntimeException("Restaurant not found with id: " + id);
	        }
	    }

	    

}
