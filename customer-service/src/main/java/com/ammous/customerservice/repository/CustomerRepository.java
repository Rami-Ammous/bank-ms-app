package com.ammous.customerservice.repository;

import com.ammous.customerservice.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;


/**
 * @author Rami Ammous
 */
public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
