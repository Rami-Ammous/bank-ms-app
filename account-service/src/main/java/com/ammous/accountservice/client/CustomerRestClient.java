package com.ammous.accountservice.client;

import com.ammous.accountservice.dto.CustomerDto;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

/**
 * @author Rami Ammous
 */
@FeignClient("CUSTOMER-SERVICE")
public interface CustomerRestClient {

    @GetMapping("/customers")
    @CircuitBreaker(name = "customerService" , fallbackMethod = "getAllDefaultCustomer")
    public List<CustomerDto> customerList();


    @GetMapping("/customers/{id}")
    @CircuitBreaker(name = "customerService" , fallbackMethod = "getDefaultCustomer")
    public CustomerDto customerById(@PathVariable Long id);


    default CustomerDto getDefaultCustomer(Long id, Exception exception) {
        return CustomerDto.builder()
                .id(id)
                .firstName("Not Vailable")
                .lastName("Not Vailable")
                .email("Not Vailable")
                .build();
    }

    default List<CustomerDto> getAllDefaultCustomer(Exception exception){
        return List.of();
    }
}
