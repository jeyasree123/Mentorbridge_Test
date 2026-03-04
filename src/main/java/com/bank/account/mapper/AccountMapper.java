package com.bank.account.mapper;

import com.bank.account.entity.AccountEntity;
import com.bank.account.model.AccountDto;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class AccountMapper {
    private final ModelMapper modelMapper;

    public AccountEntity dtoToEntity(AccountDto accountDto) {
        return modelMapper.map(accountDto, AccountEntity.class);


    }

    public AccountDto entityToDto(AccountEntity accountEntity) {
        return modelMapper.map(accountEntity, AccountDto.class);

    }
}
