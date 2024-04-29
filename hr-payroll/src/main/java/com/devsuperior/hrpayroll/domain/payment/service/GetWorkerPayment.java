package com.devsuperior.hrpayroll.domain.payment.service;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.devsuperior.hrpayroll.clients.worker.Worker;
import com.devsuperior.hrpayroll.clients.worker.WorkerClient;
import com.devsuperior.hrpayroll.clients.worker.WorkerNotFoundException;
import com.devsuperior.hrpayroll.domain.payment.entity.Payment;
import com.devsuperior.hrpayroll.domain.payment.usecases.GetWorkerPaymentUseCase;

@Service
public class GetWorkerPayment implements GetWorkerPaymentUseCase {

    private final WorkerClient client;

    public GetWorkerPayment(WorkerClient client) {
        this.client = client;
    }

    @Override
    public Payment getPayment(Long workerId, Integer days) {
        ResponseEntity<Worker> response = client.getWorker(workerId);

        if (response.getStatusCode().equals(HttpStatus.NOT_FOUND)) {
            throw new WorkerNotFoundException();
        }

        Worker worker = response.getBody();
        return new Payment(worker.getNome(), worker.getDailyIncome(), days);
    }

}
