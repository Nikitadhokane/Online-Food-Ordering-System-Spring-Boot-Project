package com.sb.foodsystem.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sb.foodsystem.entity.Admin;

public interface AdminRepository extends JpaRepository<Admin,Long> {
	
	Admin findAdminById(Long id);

}
