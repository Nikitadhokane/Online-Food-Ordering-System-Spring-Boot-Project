package com.sb.foodsystem.services;

import java.util.List;

import com.sb.foodsystem.entity.Admin;
import com.sb.foodsystem.model.AdminDTO;



public interface Admin_Service  {
	
	AdminDTO createAdmin(Admin admin);
	List<AdminDTO> getAllAdmins();
	AdminDTO getAdminById(Long id);
	AdminDTO updateAdmin(Long id, Admin admin);
	
	

}
