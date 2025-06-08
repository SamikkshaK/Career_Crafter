package com.careercrafter.jobportals.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class JobSeeker {
    @Id @GeneratedValue
    private Long id;
    private String name;
    private String email;
    private String password;
    private String resumeUrl;
}
