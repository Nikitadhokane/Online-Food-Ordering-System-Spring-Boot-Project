package com.sb.foodsystem.service;

import com.sb.foodsystem.model.CartDTO;

public interface CartService {

    CartDTO createCart(CartDTO cartDTO);

    CartDTO getCartById(Long id);

    CartDTO updateCart(Long id, CartDTO cartDTO);

}
