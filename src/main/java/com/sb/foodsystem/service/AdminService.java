package com.sb.foodsystem.service;

import com.sb.foodsystem.model.AdminDTO;

public interface AdminService {
	
    AdminDTO createAdmin(AdminDTO adminDTO);
    AdminDTO getAdminById(Long id);
    AdminDTO updateAdmin(Long id, AdminDTO adminDTO);
    String deleteAdmin(Long id);
    
}