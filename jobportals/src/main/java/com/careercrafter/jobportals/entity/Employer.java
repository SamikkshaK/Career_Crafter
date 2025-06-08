package com.careercrafter.jobportals.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Employer {
    @Id @GeneratedValue
    private Long id;
    private String companyName;
    private String email;
    private String password;
}
