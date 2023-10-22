package com.sb.foodsystem.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sb.foodsystem.dao.PaymentRepository;
import com.sb.foodsystem.entity.Payment;

@Service
public class PaymentService {

	    @Autowired
	    private final PaymentRepository paymentRepository;
	    
	    public PaymentService(PaymentRepository paymentRepository) 
	    {
	        this.paymentRepository = paymentRepository;
	    }

	    public Payment savePayment(Payment payment)
	    {
	        return paymentRepository.save(payment);
	    }

	    public List<Payment> getAllPayments() 
	    {
	        return paymentRepository.findAll();
	    }

	    public Optional<Payment> getPaymentById(Long paymentId) 
	    {
	        return paymentRepository.findById(paymentId);
	    }

	    public Payment updatePayment(Payment payment) 
	    {
	        return paymentRepository.save(payment);
	    }

	    
	}