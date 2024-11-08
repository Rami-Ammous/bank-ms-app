package com.ammous.customerservice.mapper;

import com.ammous.customerservice.dto.CustomerDto;
import com.ammous.customerservice.entities.Customer;

/**
 * @author Rami Ammous
 */
public class CustomerMapper {

    public static CustomerDto toDto (Customer customer) {
        if (customer == null) return null;
        return CustomerDto.builder()
                .id(customer.getId())
                .firstName(customer.getFirstName())
                .lastName(customer.getLastName())
                .email(customer.getEmail())
                .build();
    }

    public static Customer toEntity (CustomerDto customerDto) {
        if (customerDto == null) return null;
        return Customer.builder()
                .id(customerDto.getId())
                .firstName(customerDto.getFirstName())
                .lastName(customerDto.getLastName())
                .email(customerDto.getEmail())
                .build();
    }
}
