package com.loanapproval.paymentservice.entity;


import java.sql.Date;
import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="payment_details")
public class PaymentDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer paymentId;
	private Integer loanId;
	private Integer customerId;
	private Double loanAmount;
	private Double interestRate;
	private Integer tenure;
	private Double netPayable;
	private Double emiAmount;
	private LocalDate disbusrsalDate;
	public Integer getPaymentId() {
		return paymentId;
	}
	public Integer getLoanId() {
		return loanId;
	}
	public void setLoanId(Integer loanId) {
		this.loanId = loanId;
	}
	public Integer getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}
	public Double getLoanAmount() {
		return loanAmount;
	}
	public void setLoanAmount(Double loanAmount) {
		this.loanAmount = loanAmount;
	}
	public Double getInterestRate() {
		return interestRate;
	}
	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}
	public Integer getTenure() {
		return tenure;
	}
	public void setTenure(Integer tenure) {
		this.tenure = tenure;
	}
	public Double getNetPayable() {
		return netPayable;
	}
	public void setNetPayable(Double netPayable) {
		this.netPayable = netPayable;
	}
	public Double getEmiAmount() {
		return emiAmount;
	}
	public void setEmiAmount(Double emiAmount) {
		this.emiAmount = emiAmount;
	}
	public LocalDate getDisbusrsalDate() {
		return disbusrsalDate;
	}
	public void setDisbusrsalDate(LocalDate disbusrsalDate) {
		this.disbusrsalDate = disbusrsalDate;
	}
	public PaymentDetails(Integer loanId, Integer customerId, Double loanAmount, Double interestRate,
			Integer tenure, Double netPayable, Double emiAmount, LocalDate disbusrsalDate) {
		this.loanId = loanId;
		this.customerId = customerId;
		this.loanAmount = loanAmount;
		this.interestRate = interestRate;
		this.tenure = tenure;
		this.netPayable = netPayable;
		this.emiAmount = emiAmount;
		this.disbusrsalDate = disbusrsalDate;
	}
	public PaymentDetails() {
		super();
	}
}
