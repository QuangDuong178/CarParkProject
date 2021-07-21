package com.fsoft.carparkproject.repository;

import com.fsoft.carparkproject.model.Trip;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TripRepository extends JpaRepository<Trip, Long> {
//    Trip findById(Long id);
}
