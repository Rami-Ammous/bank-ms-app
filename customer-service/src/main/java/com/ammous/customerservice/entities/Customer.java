package com.ammous.customerservice.entities;

import jakarta.persistence.*;
import lombok.*;

/**
 * @author Rami Ammous
 */
@Entity
@Getter  @Builder @ToString @NoArgsConstructor @AllArgsConstructor
@Table(name = "customer")
public class Customer {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    private String email;

}
