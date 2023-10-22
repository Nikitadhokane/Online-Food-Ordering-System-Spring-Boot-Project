package com.sb.foodsystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sb.foodsystem.entity.Payment;
import com.sb.foodsystem.services.PaymentService;

@RestController
@RequestMapping("/payments")
public class PaymentController {

    @Autowired
    private final PaymentService paymentService;
    
    public PaymentController(PaymentService paymentService)
    {
        this.paymentService = paymentService;
    }

    @GetMapping
    public List<Payment> getAllPayments()
    {
        return paymentService.getAllPayments();
    }

    @GetMapping("/{paymentId}")
    public Payment getPaymentById(@PathVariable Long paymentId) 
    {
        return paymentService.getPaymentById(paymentId)
                .orElseThrow(() -> new RuntimeException("Payment not found with id: " + paymentId));
    }

    @PostMapping
    public Payment createPayment(@RequestBody Payment payment)
    {
        return paymentService.savePayment(payment);
    }

    @PutMapping("/{paymentId}")
    public Payment updatePayment(@PathVariable Long paymentId, @RequestBody Payment payment) 
    {
        if (paymentService.getPaymentById(paymentId).isPresent()) 
        {
            payment.setId(paymentId);
            return paymentService.updatePayment(payment);
        }
        else 
        {
            throw new RuntimeException("Payment not found with id: " + paymentId);
        }
    }

    

}
