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

import com.sb.foodsystem.entity.Login;
import com.sb.foodsystem.services.LoginService;

@RestController
@RequestMapping("/logins")
public class LoginController {
	
    @Autowired
    private LoginService loginService;

    public LoginController(LoginService loginService) 
    {
        this.loginService = loginService;
    }

    @GetMapping
    public List<Login> getAllLogins()
    {
        return loginService.getAllLogins();
    }

    @GetMapping("/{loginId}")
    public Login getLoginById(@PathVariable Long loginId)
    {
        return loginService.getLoginById(loginId)
                .orElseThrow(() -> new RuntimeException("Login not found with id: " + loginId));
    }

    @PostMapping
    public Login createLogin(@RequestBody Login login) 
    {
        return loginService.saveLogin(login);
    }

    @PutMapping("/{loginId}")
    public Login updateLogin(@PathVariable Long loginId, @RequestBody Login login) 
    {
        if (loginService.getLoginById(loginId).isPresent())
        {
            login.setId(loginId);
            return loginService.updateLogin(login);
        } 
        else 
        {
            throw new RuntimeException("Login not found with id: " + loginId);
        }
    }

    

}
