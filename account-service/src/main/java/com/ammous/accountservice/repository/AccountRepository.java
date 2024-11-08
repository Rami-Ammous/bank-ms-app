package com.ammous.accountservice.repository;

import com.ammous.accountservice.entities.BankAccount;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Rami Ammous
 */
public interface AccountRepository extends JpaRepository<BankAccount, String> {
}
