package com.ammous.accountservice.model;

import lombok.Builder;
import lombok.Getter;

/**
 * @author Rami Ammous
 */
@Getter @Builder
public class Customer {
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
}
