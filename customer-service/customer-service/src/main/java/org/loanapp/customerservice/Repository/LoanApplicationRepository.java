package org.loanapp.customerservice.Repository;

import org.loanapp.customerservice.entity.LoanApplication;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoanApplicationRepository extends JpaRepository<LoanApplication,Integer> {
}
