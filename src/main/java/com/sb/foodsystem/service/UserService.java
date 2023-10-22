package com.sb.foodsystem.service;

import com.sb.foodsystem.model.UserDTO;

public interface UserService {

    UserDTO createUser(UserDTO userDTO);

    UserDTO getUserById(Long id);

    UserDTO updateUser(Long id, UserDTO userDTO);

    String deleteUser(Long id);
}