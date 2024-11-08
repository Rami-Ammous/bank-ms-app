package com.ammous.customerservice;

import com.ammous.customerservice.config.GlobalConfig;
import com.ammous.customerservice.entities.Customer;
import com.ammous.customerservice.repository.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;


import java.util.List;

@SpringBootApplication
@EnableConfigurationProperties(GlobalConfig.class)
public class CustomerServiceApplication  {

	public static void main(String[] args) {
		SpringApplication.run(CustomerServiceApplication.class, args);
	}

	@Bean
	CommandLineRunner init(CustomerRepository customerRepository) {
		return args -> {
			customerRepository.saveAll(
					List.of(
							Customer.builder()
									.firstName("Rami")
									.lastName("AMMOUS")
									.email("rami.ammous@gmail.com")
									.build(),
							Customer.builder()
									.firstName("Jane")
									.lastName("bend")
									.email("jane.bend@gmail.com")
									.build()
					)
			);
		};
	}


}
