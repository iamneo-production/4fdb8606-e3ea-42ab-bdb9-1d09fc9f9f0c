package org.loanapp.customerservice.Repository;

import org.loanapp.customerservice.entity.AccountDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountDetailsRepository extends JpaRepository<AccountDetails ,Integer> {
}
