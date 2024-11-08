package com.ammous.customerservice.dto;

import lombok.Builder;
import lombok.Getter;

@Getter @Builder
public class CustomerDto {
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
}
