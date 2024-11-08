package com.ammous.accountservice.entities;

import com.ammous.accountservice.enums.AccountType;
import com.ammous.accountservice.model.Customer;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

/**
 * @author Rami Ammous
 */
@Entity
@Table(name = "account")
@Getter @Setter @Builder @AllArgsConstructor @NoArgsConstructor
public class BankAccount {

    @Id
    private String id;
    private Double balance;
    private LocalDate createAt;
    private String currency;

    @Enumerated(EnumType.ORDINAL)
    private AccountType type;

    @Transient
    private Customer customer;
    private Long idCustomer;


}
