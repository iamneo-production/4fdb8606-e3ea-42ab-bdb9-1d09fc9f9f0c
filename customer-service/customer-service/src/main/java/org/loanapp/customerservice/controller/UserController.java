package org.loanapp.customerservice.controller;

import lombok.RequiredArgsConstructor;
import org.loanapp.customerservice.dto.LoanApplicationRequestDto;
import org.loanapp.customerservice.service.LoanApplyService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/customers")
@RequiredArgsConstructor
public class UserController {

    private final LoanApplyService loanApplyService;

    @PostMapping("/applyLoan")
    public ResponseEntity<String> applyLoan(@RequestBody LoanApplicationRequestDto loanApplicationRequestDto){

       return loanApplyService.applyLoan(loanApplicationRequestDto);
    }



}
