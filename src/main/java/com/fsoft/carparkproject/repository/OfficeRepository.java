package com.fsoft.carparkproject.repository;

import com.fsoft.carparkproject.entity.Office;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OfficeRepository extends JpaRepository<Office,Long> {

}


