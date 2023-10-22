package com.sb.foodsystem.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sb.foodsystem.entity.Review;

public interface ReviewRepository extends JpaRepository<Review,Integer>{
	public Review findById(int id);

	public List<Review> findByRestaurantId(int restaurantId); 

}
