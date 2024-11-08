package com.ammous.accountservice;

import com.ammous.accountservice.client.CustomerRestClient;
import com.ammous.accountservice.dto.AccountDto;
import com.ammous.accountservice.entities.BankAccount;
import com.ammous.accountservice.enums.AccountType;
import com.ammous.accountservice.repository.AccountRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@SpringBootApplication
@EnableFeignClients
public class AccountServiceApplication {

    AccountRepository accountRepository;

    public static void main(String[] args) {
        SpringApplication.run(AccountServiceApplication.class, args);
    }


@Bean
    CommandLineRunner init(AccountRepository accountRepository, CustomerRestClient customerRestClient) {
        return args -> {

            customerRestClient.customerList().forEach(c -> {

                accountRepository.save(
                        BankAccount.builder()
                                .id(UUID.randomUUID().toString())
                                .balance(Math.random()*80000)
                                .type(AccountType.CURRENT_ACCOUNT)
                                .createAt(LocalDate.now())
                                .currency("Euro")
                                .customer(null)
                                .idCustomer(c.getId())
                                .build()
                );
            });


        };
}
}
