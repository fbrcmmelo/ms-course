package com.mscourse.hrworker.domain.worker.exception;

@SuppressWarnings("serial")
public class WorkerNotFoundException extends RuntimeException {

    public WorkerNotFoundException() {
        super("Worker not found");
    }
}
