package com.sb.foodsystem.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sb.foodsystem.dao.LoginRepository;
import com.sb.foodsystem.entity.Login;

@Service
public class LoginService {

	    @Autowired
	    private LoginRepository loginRepository;
	    
	    public LoginService(LoginRepository loginRepository) 
	    {
	        this.loginRepository = loginRepository;
	    }

	    // Save a new login
	    public Login saveLogin(Login login)
	    {
	        return loginRepository.save(login);
	    }

	    // Retrieve all logins
	    public List<Login> getAllLogins()
	    {
	        return loginRepository.findAll();
	    }

	    // Get a login by ID
	    public Optional<Login> getLoginById(Long loginId) 
	    {
	        return loginRepository.findById(loginId);
	    }

	    // Update a login
	    public Login updateLogin(Login login) 
	    {
	        return loginRepository.save(login);
	    }

	   

}
