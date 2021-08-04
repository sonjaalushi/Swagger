package com.example.springswagger.model;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.time.LocalDate;

@Entity
@Table(name = "user_details")
@Getter
@Setter
@NoArgsConstructor
public class UserDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_details_id")
    private Long id;
   @NotNull(message = "*Please provide a valid phone number")
   @Column(name = "phone_number")
    private String phoneNumber;
    @Email(message = "*Please provide a valid Email")
    @NotEmpty(message = "*Please provide an email")
    @Column(name = "email")
    private String email;
    @NotNull
    @Min(15)
    @Column(name = "age")
    private int age;
    @NotNull
    @Column(name = "gender")
    private Gender gender;


}
