package com.careercrafter.jobportals.entity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobSeekerRepository extends JpaRepository<JobSeeker, Long> {
    public interface EmployerRepository extends JpaRepository<Employer, Long> {}
    public interface JobListingRepository extends JpaRepository<JobListing, Long> {}
    public interface JobApplicationRepository extends JpaRepository<JobApplication, Long> {}

}
