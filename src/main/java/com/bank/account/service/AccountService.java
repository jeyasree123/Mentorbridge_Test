package com.bank.account.service;

import com.bank.account.entity.AccountEntity;
import com.bank.account.mapper.AccountMapper;
import com.bank.account.model.AccountDto;
import com.bank.account.repository.AccountRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AccountService {
    private final AccountRepository accountRepository;
    private final AccountMapper accountMapper;
    public ResponseEntity<String> createAccount(AccountDto accountDto) {
        AccountEntity accountEntity = accountMapper.dtoToEntity(accountDto);
        accountRepository.save(accountEntity);
        return ResponseEntity.status(HttpStatus.CREATED).body("Account Created");
    }

    public ResponseEntity<List<AccountDto>> getAllAccounts() {
        List<AccountEntity> accountEntity=accountRepository.findAll();
        List<AccountDto> accountDtoList=accountEntity.stream()
                .map(accountMapper::entityToDto)
                .toList();
        return ResponseEntity.ok(accountDtoList);
    }

    public ResponseEntity<String> depositAmount(String accountNumber, Double amount) {
        AccountEntity account=accountRepository.findByAccountNumber(accountNumber).orElseThrow(() -> new RuntimeException("Account Not Found"));
        if(amount<=0){
            return ResponseEntity.badRequest().body("Invalid Deposit Amount");
        }
        account.setBalance(account.getBalance()+amount);
        accountRepository.save(account);
        return ResponseEntity.ok("Amount Deposited Successfully");
    }

    public ResponseEntity<String> withDrawAmount(String accountNumber, Double amount) {
        AccountEntity account=accountRepository.findByAccountNumber(accountNumber).orElseThrow(() -> new RuntimeException("Account Not Found"));
        if(amount<=0){
            return ResponseEntity.badRequest().body("Invalid withDraw Amount");
        }
        account.setBalance(account.getBalance()-amount);
        accountRepository.save(account);
        return ResponseEntity.ok("Amount withDraw Successfully");
    }
}
