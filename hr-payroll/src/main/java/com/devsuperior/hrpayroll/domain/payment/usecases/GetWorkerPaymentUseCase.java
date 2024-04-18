package com.devsuperior.hrpayroll.domain.payment.usecases;

import com.devsuperior.hrpayroll.domain.payment.entity.Payment;

public interface GetWorkerPaymentUseCase {

    Payment getPayment(Long workerId, Integer days);
}
