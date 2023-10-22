package com.sb.foodsystem.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sb.foodsystem.converter.LoginConverter;
import com.sb.foodsystem.dao.LoginRepository;
import com.sb.foodsystem.entity.Login;
import com.sb.foodsystem.model.LoginDTO;
import com.sb.foodsystem.service.LoginService;

@Service
public class LoginServiceImpl implements LoginService {

	@Autowired
    private final LoginRepository loginRepository;
	
	@Autowired
    private final LoginConverter loginConverter;

    public LoginServiceImpl(LoginRepository loginRepository, LoginConverter loginConverter) 
    {
        this.loginRepository = loginRepository;
        this.loginConverter = loginConverter;
    }

    @Override
    public LoginDTO createLogin(LoginDTO loginDTO) 
    {
        Login login = loginConverter.dtoToEntity(loginDTO);
        login = loginRepository.save(login);
        return loginConverter.entityToDto(login);
    }

    @Override
    public LoginDTO getLoginById(Long id) 
    {
        Login login = loginRepository.findById(id).orElse(null);
        return loginConverter.entityToDto(login);
    }

    @Override
    public LoginDTO updateLogin(Long id, LoginDTO loginDTO) 
    {
        Login login = loginConverter.dtoToEntity(loginDTO);
        login.setId(id); // Assuming id is part of the LoginDTO
        login = loginRepository.save(login);
        return loginConverter.entityToDto(login);
    }

    
}