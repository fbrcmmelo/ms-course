package com.devsuperior.hrpayroll.domain.payment.service;

import org.springframework.stereotype.Service;

import com.devsuperior.hrpayroll.domain.payment.entity.Payment;

@Service
public class PaymentService {
    
    public Payment getPayment(long workerId, int days) {
        return new Payment("Bob", 200.0, days);
    }
}
