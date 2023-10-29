package com.sb.foodsystem.dao;

import org.springframework.data.jpa.repository.JpaRepository;


import com.sb.foodsystem.entity.OrderDetails;

public interface OrderDetailsRepository extends JpaRepository<OrderDetails, Long> {
	
	OrderDetails findOrderDetailsByOrderDetailsId(Long orderDetailsId);

}
