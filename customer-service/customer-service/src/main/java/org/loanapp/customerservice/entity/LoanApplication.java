package org.loanapp.customerservice.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class LoanApplication {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int loanId;//(pk)
    @ManyToOne
    private LoanStatus status ;//(enum LoanStatus)
    @ManyToOne
    private User user;//(fk) (User)
    @ManyToOne
    private LoanType loanType;// (enum LoanType)
    private Double loanAmount;
    private Date appliedDate;
    private int tenure;
}
