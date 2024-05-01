package com.devsuperior.hrpayroll.application.payment.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.hrpayroll.application.payment.dto.PaymentDTO;
import com.devsuperior.hrpayroll.application.payment.mapper.PaymentMapper;
import com.devsuperior.hrpayroll.domain.payment.service.GetWorkerPayment;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
@RequestMapping(value = "/payments", produces = MediaType.APPLICATION_JSON_VALUE)
public class PaymentController {

	private final GetWorkerPayment service;
	private final PaymentMapper mapper;

	private static final Logger logger = LoggerFactory.getLogger(PaymentController.class);

	public PaymentController(GetWorkerPayment service, PaymentMapper mapper) {
		this.service = service;
		this.mapper = mapper;
	}

	@HystrixCommand(fallbackMethod = "getPaymentWhenServiceIsOff")
	@GetMapping("workers/{workerId}/days/{days}")
	public ResponseEntity<PaymentDTO> getPayment(@PathVariable Long workerId, @PathVariable Integer days) {
		logger.info("Getting the employee's payment of worker of id: {} about: {} days.", workerId, days);
		return ResponseEntity.ok(mapper.toDTO(service.getPayment(workerId, days)));
	}

	public ResponseEntity<PaymentDTO> getPaymentWhenServiceIsOff(Long workerId, Integer days) {
		logger.info("Getting offline service the employee's payment of worker of id: {} about: {} days.", workerId,
				days);
		return ResponseEntity.ok(new PaymentDTO("", days));
	}
}
