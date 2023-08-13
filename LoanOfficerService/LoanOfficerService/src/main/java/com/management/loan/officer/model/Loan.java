package com.management.loan.officer.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Loan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int loanId;
    
    @Enumerated(EnumType.STRING)
    private LoanStatus loanStatus;
    
    private LoanType loanType;
    private double loanAmount;
    private LocalDate appliedDate;
    private int tenureInMonths;
    @ManyToOne
    @JoinColumn(name = "user_id")
	private User user;

    public int getLoanId() {
        return loanId;
    }

    public void setLoanId(int loanId) {
        this.loanId = loanId;
    }

    public LoanStatus getLoanStatus() {
        return loanStatus;
    }

    public void setLoanStatus(LoanStatus loanStatus) {
        this.loanStatus = loanStatus;
    }

    public LoanType getLoanType() {
        return loanType;
    }

    public void setLoanType(LoanType loanType) {
        this.loanType = loanType;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }

    public LocalDate getAppliedDate() {
        return appliedDate;
    }

    public void setAppliedDate(LocalDate appliedDate) {
        this.appliedDate = appliedDate;
    }

    public int getTenureInMonths() {
        return tenureInMonths;
    }

    public void setTenureInMonths(int tenureInMonths) {
        this.tenureInMonths = tenureInMonths;
    }

    public User getCustomer() {
        return user;
    }

    public void setCustomer(User user) {
        this.user = user;
    }
    public Loan() {
        super();
    }

    public Loan(LoanStatus loanStatus, LoanType loanType, double loanAmount, LocalDate appliedDate, int tenureInMonths,
                User user) {
        this.loanStatus = loanStatus;
        this.loanType = loanType;
        this.loanAmount = loanAmount;
        this.appliedDate = appliedDate;
        this.tenureInMonths = tenureInMonths;
        this.user = user;
    }
}


