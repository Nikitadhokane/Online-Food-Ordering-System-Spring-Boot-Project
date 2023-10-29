package com.sb.foodsystem.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sb.foodsystem.entity.Cart;

public interface CartRepository extends JpaRepository<Cart,Long>
{
	Cart findByCartId(Long cartId);

}
