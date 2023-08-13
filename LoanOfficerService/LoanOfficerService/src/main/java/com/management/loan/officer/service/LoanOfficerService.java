package com.management.loan.officer.service;

import com.management.loan.officer.model.Loan;

import java.util.List;

public interface LoanOfficerService {
    List<Loan> getAllPendingLoans();
}
