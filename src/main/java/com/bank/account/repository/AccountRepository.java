package com.bank.account.repository;

import com.bank.account.entity.AccountEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AccountRepository extends JpaRepository<AccountEntity,String> {
    Optional<AccountEntity> findByAccountNumber(String accountNumber);
}
