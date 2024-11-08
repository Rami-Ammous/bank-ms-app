package com.ammous.accountservice.controller;

import com.ammous.accountservice.controller.api.AccountApi;
import com.ammous.accountservice.dto.AccountDto;
import com.ammous.accountservice.mapper.AccountMapper;
import com.ammous.accountservice.repository.AccountRepository;
import com.ammous.accountservice.client.CustomerRestClient;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.function.Function;

/**
 * @author Rami Ammous
 */
@RestController
public class AccountController implements AccountApi {

    private AccountRepository accountRepository;
    private CustomerRestClient customerClient;

    public AccountController(AccountRepository accountRepository, CustomerRestClient customerClient) {
        this.accountRepository = accountRepository;
        this.customerClient = customerClient;
    }

    Function<AccountDto, AccountDto> affectCustomer = e -> {
        e.setCustomer(customerClient.customerById(e.getIdCustomer()));
        return e;
    };

    @Override
    public List<AccountDto> accountList() {
        return accountRepository.findAll().stream().map(AccountMapper::toDto)
                .map(affectCustomer).toList();
    }

    @Override
    public AccountDto accountById(String id) {



        return accountRepository.findById(id).map(AccountMapper::toDto)
                .map(affectCustomer)
                .orElseThrow(() -> new RuntimeException("Account not found"));

    }
}
