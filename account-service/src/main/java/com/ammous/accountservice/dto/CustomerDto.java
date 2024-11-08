package com.ammous.accountservice.dto;

import lombok.Builder;
import lombok.Getter;

/**
 * @author Rami Ammous
 */
@Getter @Builder
public class CustomerDto {
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
}
