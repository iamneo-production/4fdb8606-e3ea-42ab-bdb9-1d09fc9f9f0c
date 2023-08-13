package org.loanapp.customerservice.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class User {

 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private int  userId;
 private String firstName;
 private String lastName;
 private String mobileNo;
 private String address;
 private String email;
 private Double anualIncome;
 @ManyToOne
 private EmployeementType employeementType;
 @OneToOne
 private AccountDetails accountId;









}
