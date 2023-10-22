package com.sb.foodsystem.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sb.foodsystem.entity.User;

public interface UserRepository  extends JpaRepository<User,Long> {
	
	User findByUserId(Long userId);

}
