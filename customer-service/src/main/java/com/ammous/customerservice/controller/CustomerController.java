package com.ammous.customerservice.controller;

import com.ammous.customerservice.controller.api.CustomerApi;
import com.ammous.customerservice.dto.CustomerDto;
import com.ammous.customerservice.entities.Customer;
import com.ammous.customerservice.mapper.CustomerMapper;
import com.ammous.customerservice.repository.CustomerRepository;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Rami Ammous
 */
@RestController
public class CustomerController implements CustomerApi {

    CustomerRepository customerRepository;
    public CustomerController(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public List<CustomerDto> customerList() {
        return customerRepository.findAll().stream().map(CustomerMapper::toDto).toList();
    }

    public CustomerDto customerById(Long id) {
        return customerRepository.findById(id).map(e -> CustomerMapper.toDto(e))
                .orElseThrow(() -> new RuntimeException("Customer not found"));
    }

}
