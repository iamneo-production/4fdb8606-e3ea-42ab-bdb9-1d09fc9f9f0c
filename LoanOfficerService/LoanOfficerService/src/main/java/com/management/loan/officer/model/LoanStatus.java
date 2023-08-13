package com.management.loan.officer.model;

public enum LoanStatus {
    PENDING("PENDING"),
    APPROVED("APPROVED"),
    REJECTED("REJECTED");
    
    public final String loanStatus;
    private LoanStatus(String loanStatus)
    {
    	this.loanStatus=loanStatus;
    }
    public String getLoanStatus()
    {
    	return loanStatus;
    }
}