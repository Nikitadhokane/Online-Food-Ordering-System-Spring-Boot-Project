package com.sb.foodsystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sb.foodsystem.entity.Cart;
import com.sb.foodsystem.services.CartService;

@RestController
@RequestMapping("/cart")
public class CartController {

	    @Autowired
	    private CartService cartService;
	    
	    public CartController(CartService cartService)
	    {
	        this.cartService = cartService;
	    }

	    @GetMapping
	    public List<Cart> getAllCarts() 
	    {
	        return cartService.getAllCarts();
	    }

	    @GetMapping("/{cartId}")
	    public Cart getCartById(@PathVariable Long cartId)
	    {
	        return cartService.getCartById(cartId)
	                .orElseThrow(() -> new RuntimeException("Cart not found with id: " + cartId));
	    }

	    @PostMapping
	    public Cart createCart(@RequestBody Cart cart)
	    {
	        return cartService.saveCart(cart);
	    }

	    @PutMapping("/{cartId}")
	    public Cart updateCart(@PathVariable Long cartId, @RequestBody Cart cart) 
	    {
	        if (cartService.getCartById(cartId).isPresent()) {
	            cart.setId(cartId);
	            return cartService.updateCart(cart);
	        } else {
	            throw new RuntimeException("Cart not found with id: " + cartId);
	        }
	    }

	    
}
