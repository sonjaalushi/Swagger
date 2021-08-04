package com.example.springswagger.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "instructor_details")
@Getter
@Setter
@NoArgsConstructor
public class InstructorDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "instructor_details_id")
    private Long id;
    @NotNull(message = "*Please provide a valid phone number")
    @Column(name = "number")
    private String number;
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