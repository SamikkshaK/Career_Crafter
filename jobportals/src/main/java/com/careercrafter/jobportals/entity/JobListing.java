package com.careercrafter.jobportals.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class JobListing {
    @Id @GeneratedValue
    private Long id;
    private String title;
    private String description;
    private String location;
    private String qualifications;

    @ManyToOne
    private Employer postedBy;
}
