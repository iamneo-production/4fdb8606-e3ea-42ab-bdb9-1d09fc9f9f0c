package com.loanapproval.paymentservice.service;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.loanapproval.paymentservice.entity.PaymentDetails;
import com.loanapproval.paymentservice.entity.PaymentRequestDTO;
import com.loanapproval.paymentservice.repository.PaymentRepository;

import jakarta.persistence.EntityManager;

@Service
public class PaymentServiceImpl implements IPaymentService{
	
	@Autowired
	PaymentRepository paymentRepository;
	
	@Autowired
	private EntityManager entityManager;
	
	@Override
	public ResponseEntity<String> getPaymentSchedule(PaymentRequestDTO paymentRequestDto) {
		int loanId = paymentRequestDto.getLoanId();
		int customerId = paymentRequestDto.getCustomerId();
		String loanSql = "SELECT * FROM loan_details WHERE loanId = :loanId";
	    Object[] result = (Object[])entityManager
	            .createNativeQuery(loanSql)
	            .setParameter("loanId", loanId)
	            .getSingleResult();
	    if(result != null) {
	    	Double loanAmount = (Double)result[4];
	    	Double interestRate = (Double)result[5];
	    	Integer tenure = (Integer)result[6];
	    	Double emiAmount = calculateEMI(loanAmount, interestRate, tenure);
	    	Double netPayable = emiAmount*tenure;
	    	PaymentDetails paymentDetails = new PaymentDetails(loanId, customerId, loanAmount, interestRate,
	    		tenure, netPayable, emiAmount, LocalDate.now());
	    	paymentRepository.save(paymentDetails);
	    	return ResponseEntity.status(HttpStatus.CREATED).body("schedule created successfully");
	    }
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Issue while scheduling payment");
	}
	
	public double calculateEMI(double principal, double annualInterestRate, int loanTenureMonths) {
        double monthlyInterestRate = (annualInterestRate / 12) / 100;
        double numerator = principal * monthlyInterestRate * Math.pow(1 + monthlyInterestRate, loanTenureMonths);
        double denominator = Math.pow(1 + monthlyInterestRate, loanTenureMonths) - 1;
        double emi = numerator / denominator;
        return emi;
    }

}
