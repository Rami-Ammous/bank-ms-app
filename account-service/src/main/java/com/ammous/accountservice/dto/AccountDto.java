package com.ammous.accountservice.dto;

import com.ammous.accountservice.enums.AccountType;
import com.ammous.accountservice.model.Customer;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Transient;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

/**
 * @author Rami Ammous
 */
@Setter
@Getter @Builder
public class AccountDto {

    private String id;
    private Double balance;
    private LocalDate createAt;
    private String currency;
    private AccountType type;
    private CustomerDto customer;
    private Long idCustomer;
}
