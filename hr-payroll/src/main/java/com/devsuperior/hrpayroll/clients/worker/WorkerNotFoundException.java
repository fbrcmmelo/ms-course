package com.devsuperior.hrpayroll.clients.worker;

@SuppressWarnings("serial")
public class WorkerNotFoundException extends RuntimeException {
    
    public WorkerNotFoundException() {
        super("Worker not found");
    }
}
