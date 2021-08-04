package com.example.springswagger.model;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.time.LocalDate;

@Entity
@Table(name = "diets_details")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class DietsDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "diets_details_id")
    private Long id;
    @Column(name = "rating")
    private int rating;
    @Size(min = 10, max = 200, message
            = "Components must be between 10 and 200 characters")
    @Column(name = "components")
    private String components;
    @Size(min = 10, max = 200, message
            = "Description must be between 10 and 200 characters")
    @Column(name = "description")
    private String description;
    @NotNull
    @Column(name = "price")
    private double price;


}
