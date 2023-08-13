package org.loanapp.customerservice.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class EmployeementType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int employeementId;
    private String employeementType; // salaried, selfemployed
}
