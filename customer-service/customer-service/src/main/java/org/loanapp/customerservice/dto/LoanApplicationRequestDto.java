package org.loanapp.customerservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.loanapp.customerservice.entity.LoanType;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class LoanApplicationRequestDto {


    private String email;
    private String loanType;
    private Double loanAmount;
    private Date appliedDate;
    private int tenure;



}
