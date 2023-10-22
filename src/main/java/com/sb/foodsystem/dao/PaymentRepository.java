package com.sb.foodsystem.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sb.foodsystem.entity.Payment;

public interface PaymentRepository extends JpaRepository<Payment, Long>{
	
	Payment findPaymentById(Long id);

}
