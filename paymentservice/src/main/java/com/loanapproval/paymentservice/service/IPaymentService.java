package com.loanapproval.paymentservice.service;

import org.springframework.http.ResponseEntity;

import com.loanapproval.paymentservice.entity.PaymentRequestDTO;


public interface IPaymentService {
	public ResponseEntity<String> getPaymentSchedule(PaymentRequestDTO paymentRequest); 
}
