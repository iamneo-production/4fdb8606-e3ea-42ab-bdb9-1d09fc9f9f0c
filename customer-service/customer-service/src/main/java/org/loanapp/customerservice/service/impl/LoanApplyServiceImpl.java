package org.loanapp.customerservice.service.impl;

import lombok.RequiredArgsConstructor;
import org.loanapp.customerservice.Repository.*;
import org.loanapp.customerservice.dto.LoanApplicationRequestDto;
import org.loanapp.customerservice.entity.LoanApplication;
import org.loanapp.customerservice.entity.LoanStatus;
import org.loanapp.customerservice.entity.LoanType;
import org.loanapp.customerservice.entity.User;
import org.loanapp.customerservice.service.LoanApplyService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LoanApplyServiceImpl implements LoanApplyService {

    private final LoanTypeRepository loanTypeRepository;

    private final LoanApplicationRepository loanApplicationRepository;
    private final LoanStatusRepository loanStatusRepository;
    private final UserRepository userRepository;
    @Override
    public ResponseEntity<String> applyLoan(LoanApplicationRequestDto loanApplicationRequestDto) {
        LoanApplication loanApplication = new LoanApplication();

        User user = userRepository.findByEmail(loanApplicationRequestDto.getEmail());

        LoanType loanType = loanTypeRepository.findByLoanType(loanApplicationRequestDto.getLoanType());

        LoanStatus loanStatus =loanStatusRepository.findByStatusType("pending");

        if(user != null && loanType != null){


            loanApplication.setLoanAmount(loanApplicationRequestDto.getLoanAmount());
            loanApplication.setLoanType(loanType);
            loanApplication.setAppliedDate(loanApplicationRequestDto.getAppliedDate());
            loanApplication.setTenure(loanApplicationRequestDto.getTenure());
            loanApplication.setStatus(loanStatus);
            loanApplication.setUser(user);

           loanApplicationRepository.save(loanApplication);
           return ResponseEntity.status(HttpStatus.CREATED).body("Successfully Applied");

        }
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Invalid Details");
    }
}
