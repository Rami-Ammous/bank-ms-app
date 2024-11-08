package com.ammous.accountservice.controller.api;

import com.ammous.accountservice.dto.AccountDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

/**
 * @author Rami Ammous
 */
public interface AccountApi {

    @GetMapping("/accounts")
    public List<AccountDto> accountList();

    @GetMapping("/accounts/{id}")
    public AccountDto accountById(@PathVariable String id);
}
