package edu.wctc.databasedemo.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "PETS")
@Data
@NoArgsConstructor
public class Pets {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pet_id")
    private int id;

    @Column(name = "pet_name")
    private String name;

    @Column(name = "pet_species")
    private String species;

    @Column(name = "pet_age")
    private int age;
}
