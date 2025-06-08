package com.careercrafter.jobportals.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class JobApplication {
    @Id @GeneratedValue
    private Long id;

    @ManyToOne
    private JobSeeker jobSeeker;

    @ManyToOne
    private JobListing jobListing;

    private String status; 
}
