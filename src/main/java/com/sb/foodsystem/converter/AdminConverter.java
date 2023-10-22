package com.sb.foodsystem.converter;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import com.sb.foodsystem.entity.Admin;
import com.sb.foodsystem.model.AdminDTO;


@Component
public class AdminConverter {
	
	//convert from DTO to Entity

	public  Admin convertToAdminEntity(AdminDTO adminDto)
	{
		Admin admin = new Admin();
		if(adminDto!=null)
		{
			BeanUtils.copyProperties(adminDto, admin);
		}
	     return admin;
	}

	//convert from Entity to DTO
	public AdminDTO convertToAdminDTO(Admin admin)
	{
		AdminDTO adminDto = new AdminDTO();
		if(admin!=null)
		{
			BeanUtils.copyProperties(admin, adminDto);
		}
		return adminDto;
	}

	
	}


