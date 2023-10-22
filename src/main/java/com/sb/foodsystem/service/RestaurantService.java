package com.sb.foodsystem.service;

import com.sb.foodsystem.model.RestaurantDTO;

public interface RestaurantService {

    RestaurantDTO createRestaurant(RestaurantDTO restaurantDTO);

    RestaurantDTO getRestaurantById(Long id);

    RestaurantDTO updateRestaurant(Long id, RestaurantDTO restaurantDTO);

    String deleteRestaurant(Long id);
}