package com.example.dethimodul4.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private int age;
    private long Salary;

    @ManyToOne
    private Branch branch;
}
