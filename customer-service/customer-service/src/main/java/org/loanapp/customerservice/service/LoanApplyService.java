package org.loanapp.customerservice.service;

import org.loanapp.customerservice.dto.LoanApplicationRequestDto;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public interface LoanApplyService {
    ResponseEntity<String> applyLoan(LoanApplicationRequestDto loanApplicationRequestDto);
}
