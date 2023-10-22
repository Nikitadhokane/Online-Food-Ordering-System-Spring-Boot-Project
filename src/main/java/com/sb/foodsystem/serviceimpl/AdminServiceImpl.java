package com.sb.foodsystem.serviceimpl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sb.foodsystem.converter.AdminConverter;
import com.sb.foodsystem.dao.AdminRepository;
import com.sb.foodsystem.entity.Admin;
import com.sb.foodsystem.model.AdminDTO;
import com.sb.foodsystem.service.AdminService;

@Service
public class AdminServiceImpl implements AdminService {

	@Autowired
    private  AdminRepository adminRepository;
	
	@Autowired
    private  AdminConverter adminConverter;

    public AdminServiceImpl(AdminRepository adminRepository, AdminConverter adminConverter)
    {
        this.adminRepository = adminRepository;
        this.adminConverter = adminConverter;
    }

    @Override
    public AdminDTO createAdmin(AdminDTO adminDTO) 
    {
        Admin admin = adminConverter.convertToAdminEntity(adminDTO);
        admin = adminRepository.save(admin);
        return adminConverter.convertToAdminDTO(admin);
    }

    @Override
    public AdminDTO getAdminById(Long id)
    {
        Admin admin = adminRepository.findById(id).orElse(null);
        return adminConverter.convertToAdminDTO(admin);
    }

    @Override
    public AdminDTO updateAdmin(Long id, AdminDTO adminDTO) 
    {
        Admin admin = adminConverter.convertToAdminEntity(adminDTO);
        admin.setId(id); // Assuming id is part of the AdminDTO
        admin = adminRepository.save(admin);
        return adminConverter.convertToAdminDTO(admin);
    }

    @Override
    public String deleteAdmin(Long id) 
    {
        adminRepository.deleteById(id);
        return "Admin with ID " + id + " has been deleted successfully.";
    }
}