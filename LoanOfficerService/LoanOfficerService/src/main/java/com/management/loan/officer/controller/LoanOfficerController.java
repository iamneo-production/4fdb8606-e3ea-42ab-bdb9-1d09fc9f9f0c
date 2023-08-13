package com.management.loan.officer.controller;

import com.management.loan.officer.exception.CustomException;
import com.management.loan.officer.model.Loan;
import com.management.loan.officer.serviceImpl.LoanOfficerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/loan-officer")
public class LoanOfficerController {


    @Autowired
    LoanOfficerServiceImpl loanOfficerService;
    @GetMapping("/pending-applications")
    public ResponseEntity<List<Loan>> pendingLoans()
    {
        List<Loan> pendingLoans =  loanOfficerService.getAllPendingLoans();
        if(pendingLoans==null)
            throw new CustomException("Currently there are no pending applications");
        return ResponseEntity.status(HttpStatus.OK).body(pendingLoans);
    }
}
