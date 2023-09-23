package com.devsuperior.hrpayroll.domain.payment.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.devsuperior.hrpayroll.clients.worker.Worker;
import com.devsuperior.hrpayroll.clients.worker.WorkerClient;
import com.devsuperior.hrpayroll.clients.worker.WorkerNotFoundException;
import com.devsuperior.hrpayroll.domain.payment.entity.Payment;

@Service
public class PaymentService {

    private final WorkerClient client;

    @Autowired
    public PaymentService(WorkerClient client) {
        this.client = client;
    }
    
    public Payment getPayment(Integer workerId, Integer days) {
        ResponseEntity<Worker> response = client.getWorker(workerId);
        
        if (response.getStatusCode().equals(HttpStatus.NOT_FOUND))
            throw new WorkerNotFoundException();

        Worker worker = response.getBody();
        return new Payment(worker.getNome(), worker.getDailyIncome(), days);
    }
}
