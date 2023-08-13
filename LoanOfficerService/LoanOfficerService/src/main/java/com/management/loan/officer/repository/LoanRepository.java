package com.management.loan.officer.repository;

import com.management.loan.officer.model.Loan;
import com.management.loan.officer.model.LoanStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LoanRepository extends JpaRepository<Loan,Integer> {
    
	List<Loan> findAllByLoanStatus(LoanStatus loanStatus);
}
