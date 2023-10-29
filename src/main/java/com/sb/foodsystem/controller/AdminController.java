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

import com.sb.foodsystem.converter.AdminConverter;
import com.sb.foodsystem.model.AdminDTO;
import com.sb.foodsystem.service.AdminService;

@RestController
//@RequestMapping("/admins")
@RequestMapping("/api")
public class AdminController {

    @Autowired
    private AdminService adminService;

    @SuppressWarnings("unused")
	@Autowired
    private AdminConverter adminConverter;

    @PostMapping
    public AdminDTO createAdmin(@RequestBody AdminDTO adminDTO)
    {
        return adminService.createAdmin(adminDTO);
    }

    @GetMapping
    public List<AdminDTO> getAllAdmins()
    {
        return adminService.getAllAdmins();
    }

    @GetMapping("/{id}")
    public AdminDTO getAdminById(@PathVariable Long id)
    {
        return adminService.getAdminById(id);
    }

    @PutMapping("/{id}")
    public AdminDTO updateAdmin(@PathVariable Long id, @RequestBody AdminDTO adminDTO)
    {
        return adminService.updateAdmin(id, adminDTO);
    }
    
}
