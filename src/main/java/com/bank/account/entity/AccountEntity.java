package com.bank.account.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="accountdetails")
public class AccountEntity {
    @Id
    private String accountNumber;
    private String accountHolderName;
    private double balance;
    private int mobileNumber;


}
