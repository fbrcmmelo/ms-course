package com.devsuperior.hrpayroll.config;

import java.util.Arrays;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.devsuperior.hrpayroll.shared.ErrorMsg;

import feign.FeignException;

@RestControllerAdvice
public class ApplicationExceptionHandler {

    @ExceptionHandler(FeignException.class)
    public ErrorMsg handlerFeignClientExceptions(FeignException exception) {
        return new ErrorMsg(500,
            Arrays.asList("Erro ao tentar se comunicar com micro serviço externo: ", exception.getLocalizedMessage()));
    }
}
