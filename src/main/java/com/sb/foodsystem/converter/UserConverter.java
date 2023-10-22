package com.sb.foodsystem.converter;

import org.springframework.stereotype.Component;

import com.sb.foodsystem.entity.User;
import com.sb.foodsystem.model.UserDTO;

@Component
public class UserConverter {

    public UserDTO entityToDto(User user)
    {
        UserDTO userDTO = new UserDTO();
        userDTO.setUserId(user.getUser_id());
        userDTO.setPassword(user.getPassword());
        userDTO.setFirstNmae(user.getFirstName());
        userDTO.setLastName(user.getLastName());
        userDTO.setEmail(user.getEmail());
        userDTO.setAddress(user.getAddress());
        userDTO.setContact(user.getContact());
        return userDTO;
    }

    public User dtoToEntity(UserDTO userDTO)
    {
        User user = new User();
        user.setUser_id(userDTO.getUserId());
        user.setPassword(userDTO.getPassword());
        user.setFirstName(userDTO.getFirstNmae());
        user.setLastName(userDTO.getLastName());
        user.setEmail(userDTO.getEmail());
        user.setAddress(userDTO.getAddress());
        user.setContact(userDTO.getContact());
        return user;
    }
}