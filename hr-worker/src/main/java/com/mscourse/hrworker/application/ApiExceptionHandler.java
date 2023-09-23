package com.mscourse.hrworker.application;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.mscourse.hrworker.domain.worker.exception.WorkerNotFoundException;

@RestControllerAdvice
public class ApiExceptionHandler {
    
    @ExceptionHandler({WorkerNotFoundException.class})
    public Error handleWorkerNotFoundException(WorkerNotFoundException exception) {
        return new Error(exception.getMessage(), 404, HttpStatus.NOT_FOUND);
    }
}

class Error {

    Error(String message, Integer code, HttpStatus codeMessage) {
        this.message = message;
        this.code = code;
        this.codeMessage = codeMessage;
    }

    private String message;
    private Integer code;
    private HttpStatus codeMessage;
}