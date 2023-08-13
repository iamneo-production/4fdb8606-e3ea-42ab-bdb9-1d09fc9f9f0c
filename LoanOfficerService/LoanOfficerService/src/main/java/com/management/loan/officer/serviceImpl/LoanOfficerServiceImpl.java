package com.management.loan.officer.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.management.loan.officer.model.Loan;
import com.management.loan.officer.model.LoanStatus;
import com.management.loan.officer.repository.LoanRepository;
import com.management.loan.officer.service.LoanOfficerService;

@Service
public class LoanOfficerServiceImpl implements LoanOfficerService {

	@Autowired
   LoanRepository loanRepository;

    @Override
    public List<Loan> getAllPendingLoans() {
    	LoanStatus loanStatus = LoanStatus.PENDING;
        return loanRepository.findAllByLoanStatus(loanStatus);
    }
}
