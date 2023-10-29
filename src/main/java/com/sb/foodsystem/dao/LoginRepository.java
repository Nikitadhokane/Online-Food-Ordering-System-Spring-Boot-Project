package com.sb.foodsystem.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sb.foodsystem.entity.Login;

public interface LoginRepository extends JpaRepository<Login, Long>{
	
	Login findByLoginId(Long loginId);

}
