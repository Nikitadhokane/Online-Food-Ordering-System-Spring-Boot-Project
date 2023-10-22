package com.sb.foodsystem.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sb.foodsystem.converter.CartConverter;
import com.sb.foodsystem.dao.CartRepository;
import com.sb.foodsystem.entity.Cart;
import com.sb.foodsystem.model.CartDTO;
import com.sb.foodsystem.service.CartService;

@Service
public class CartServiceImpl implements CartService {

	@Autowired
    private  CartRepository cartRepository;
	
	@Autowired
    private  CartConverter cartConverter;

    public CartServiceImpl(CartRepository cartRepository, CartConverter cartConverter) 
    {
        this.cartRepository = cartRepository;
        this.cartConverter = cartConverter;
    }

    @Override
    public CartDTO createCart(CartDTO cartDTO)
    {
        Cart cart = cartConverter.dtoToEntity(cartDTO);
        cart = cartRepository.save(cart);
        return cartConverter.entityToDto(cart);
    }

    @Override
    public CartDTO getCartById(Long id)
    {
        Cart cart = cartRepository.findById(id).orElse(null);
        return cartConverter.entityToDto(cart);
    }

    @Override
    public CartDTO updateCart(Long id, CartDTO cartDTO)
    {
        Cart cart = cartConverter.dtoToEntity(cartDTO);
        cart.setId(id); // Assuming id is part of the CartDTO
        cart = cartRepository.save(cart);
        return cartConverter.entityToDto(cart);
    }

}