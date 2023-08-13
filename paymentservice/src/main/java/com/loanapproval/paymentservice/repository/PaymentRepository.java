package com.loanapproval.paymentservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.loanapproval.paymentservice.entity.PaymentDetails;

@Repository
public interface PaymentRepository extends JpaRepository<PaymentDetails, Integer> {
	
}
