package com.sb.foodsystem.converter;

import org.springframework.stereotype.Component;

import com.sb.foodsystem.entity.Cart;
import com.sb.foodsystem.model.CartDTO;


@Component
public class CartConverter {
	
	public CartDTO entityToDto(Cart cart) {
        CartDTO cartDTO = new CartDTO();
        cartDTO.setId(null);
        cartDTO.setQuantity(cart.getQuantity());
        cartDTO.setUser(cart.getUser());
        cartDTO.setMenu(cart.getMenu());
        return cartDTO;
    }

    public Cart dtoToEntity(CartDTO cartDTO) {
        Cart cart = new Cart();
        cart.setCartId(null);
        cart.setQuantity(cartDTO.getQuantity());
        cart.setUser(cartDTO.getUser());
        cart.setMenu(cartDTO.getMenu());
        return cart;
    }
}