package com.devsuperior.hrpayroll.application.payment.mapper;

import org.springframework.stereotype.Component;

import com.devsuperior.hrpayroll.application.payment.dto.PaymentDTO;
import com.devsuperior.hrpayroll.domain.payment.entity.Payment;

@Component
public class PaymentMapper {

    public PaymentDTO toDTO(Payment entity) {
        PaymentDTO dto = new PaymentDTO();
        dto.setName(entity.getName());
        dto.setDays(entity.getDays());
        dto.setIncome(entity.getIncome());

        return dto;
    }
}
