package org.loanapp.customerservice.Repository;

import org.loanapp.customerservice.entity.LoanStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoanStatusRepository extends JpaRepository<LoanStatus,Integer> {

    LoanStatus findByStatusType(String pending);
}
