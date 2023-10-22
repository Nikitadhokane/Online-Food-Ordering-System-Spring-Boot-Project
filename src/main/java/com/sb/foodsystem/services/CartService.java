package com.sb.foodsystem.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sb.foodsystem.dao.CartRepository;
import com.sb.foodsystem.entity.Cart;

@Service
public class CartService {
	@Autowired
	private CartRepository cartRepository;
   
    public CartService(CartRepository cartRepository)
    {
        this.cartRepository = cartRepository;
    }

    // Save a new cart item
    public Cart saveCart(Cart cart) 
    {
        return cartRepository.save(cart);
    }

    // Retrieve all cart items
    public List<Cart> getAllCarts() 
    {
        return cartRepository.findAll();
    }

    // Get a cart item by ID
    public Optional<Cart> getCartById(Long cartId) 
    {
        return cartRepository.findById(cartId);
    }

    // Update a cart item
    public Cart updateCart(Cart cart) 
    {
        return cartRepository.save(cart);
    }

    
}
