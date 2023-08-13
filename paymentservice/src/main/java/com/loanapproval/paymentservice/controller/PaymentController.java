package com.loanapproval.paymentservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.loanapproval.paymentservice.entity.PaymentRequestDTO;
import com.loanapproval.paymentservice.service.PaymentServiceImpl;

@RestController
@RequestMapping("api/payment")
public class PaymentController {
	
	@Autowired
	PaymentServiceImpl paymentService;
	
	@PostMapping("/calculatePayment")
	public ResponseEntity<String> getPaymentSchedule(@RequestBody PaymentRequestDTO paymentRequest){
		ResponseEntity<String> response = paymentService.getPaymentSchedule(paymentRequest);
		return response;
	}
}
