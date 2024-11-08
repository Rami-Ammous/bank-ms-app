package com.ammous.customerservice.controller.api;

import com.ammous.customerservice.dto.CustomerDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author Rami Ammous
 */
@RequestMapping
public interface CustomerApi {

    @GetMapping("/customers")
    public List<CustomerDto> customerList();


    @GetMapping("/customers/{id}")
    public CustomerDto customerById(@PathVariable Long id);

}
