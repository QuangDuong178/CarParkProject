package com.fsoft.carparkproject.repository;

import com.fsoft.carparkproject.entity.Trip;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TripRepository extends JpaRepository<Trip, Long> {
}