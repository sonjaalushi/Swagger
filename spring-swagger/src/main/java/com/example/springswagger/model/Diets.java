package com.example.springswagger.model;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.List;


@Entity
@Table(name = "diets")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Diets  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long diet_id;
    @NotNull
    @Size(min = 2, max = 30)
    @Column(name = "name")
    private String name;
    @NotNull
    @Size(min = 2, max = 30)
    @Column(name = "type")
    private String type;
    @OneToOne(fetch = FetchType.LAZY, cascade = {CascadeType.ALL})
    @JoinColumn(name = "dd_id")
    private DietsDetails dietsDetails;

    @ManyToMany(mappedBy = "diets", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH,
            CascadeType.REFRESH})
    private List<User> users;

}
