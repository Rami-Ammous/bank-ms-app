package com.ammous.accountservice.mapper;

import com.ammous.accountservice.AccountServiceApplication;
import com.ammous.accountservice.dto.AccountDto;
import com.ammous.accountservice.entities.BankAccount;

/**
 * @author Rami Ammous
 */
public class AccountMapper {

    public static AccountDto toDto(BankAccount account) {
        if (account == null) return null;
        return AccountDto.builder()
                .id(account.getId())
                .type(account.getType())
                .balance(account.getBalance())
                .createAt(account.getCreateAt())
                .currency(account.getCurrency())
                .idCustomer(account.getIdCustomer())
                .customer(CustomerMapper.toDto(account.getCustomer()))
                .build();
    }
}
