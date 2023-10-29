package com.sb.foodsystem.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sb.foodsystem.entity.Restaurant;

public interface RestaurantRepository extends JpaRepository<Restaurant, Long> {
	
	public Optional<Restaurant> findById(Long id);

}
