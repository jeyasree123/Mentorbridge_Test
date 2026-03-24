package com.bank.account.controller;

import com.bank.account.api.BankApi;
import com.bank.account.model.AccountDto;
import com.bank.account.service.AccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class AccountController implements BankApi {
    private final AccountService accountService;


    @Override
    public ResponseEntity<String> createAccount(AccountDto accountDto) {
        return accountService.createAccount(accountDto);
    }

    @Override
    public ResponseEntity<List<AccountDto>> getAllAccounts() {
        return accountService.getAllAccounts();
    }

    @Override
    public ResponseEntity<String> depositAmount(String accountNumber,  Double amount) {
        return accountService.depositAmount(accountNumber,amount);
    }

    @Override
    public ResponseEntity<String> withDrawAmount(String accountNumber, Double amount) {
        return accountService.withDrawAmount(accountNumber,amount);
    }
}
