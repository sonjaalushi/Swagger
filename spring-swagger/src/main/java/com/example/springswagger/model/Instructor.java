package com.example.springswagger.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "instructor")
@Getter
@Setter
@NoArgsConstructor

public class Instructor  {

    @Id
    @GeneratedValue
    @ApiModelProperty(value = "Autogenerated id")
    @Column(name = "instructorId")
    private Long instructorId;
    @ApiModelProperty(value = "This is the instructor name")
    @NotNull
    @Size(min = 2, max = 30)
    @Column(name = "name")
    private String name;
    @ApiModelProperty(value = "This is the instructor code")
    @NotNull
    @Column(name = "instructor_code")
    private double instructorCode;
    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "instructor_details_id")
    private InstructorDetails instructorDetails;

    @OneToMany(targetEntity = Diets.class, cascade = {CascadeType.DETACH, CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH})
    @ToString.Exclude
    @JoinColumn(name = "diets_foreign_key", referencedColumnName = "instructorId")
    private List<Diets> diets = new ArrayList<>();
}



