package com.sb.foodsystem.controller;

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

import com.sb.foodsystem.converter.CartConverter;
import com.sb.foodsystem.model.CartDTO;
import com.sb.foodsystem.service.CartService;

@RestController
//@RequestMapping("/carts")
@RequestMapping("/api/carts")
public class CartController {

	@Autowired
    private CartService cartService;
	
	@SuppressWarnings("unused")
	@Autowired
    private CartConverter cartConverter;

    public CartController(CartService cartService, CartConverter cartConverter) 
    {
        this.cartService = cartService;
        this.cartConverter = cartConverter;
    }

    @PostMapping("/create")
    public ResponseEntity<CartDTO> createCart(@RequestBody CartDTO cartDTO) 
    {
        CartDTO createdCart = cartService.createCart(cartDTO);
        return new ResponseEntity<>(createdCart, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<CartDTO> getCartById(@PathVariable Long id) 
    {
        CartDTO cart = cartService.getCartById(id);
        if (cart != null) {
            return new ResponseEntity<>(cart, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<CartDTO> updateCart(@PathVariable Long id, @RequestBody CartDTO cartDTO)
    {
        CartDTO updatedCart = cartService.updateCart(id, cartDTO);
        if (updatedCart != null) {
            return new ResponseEntity<>(updatedCart, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
