package org.loanapp.customerservice.Repository;

import org.loanapp.customerservice.entity.LoanType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoanTypeRepository extends JpaRepository<LoanType,Integer> {
    LoanType findByLoanType(String loanType);
}
