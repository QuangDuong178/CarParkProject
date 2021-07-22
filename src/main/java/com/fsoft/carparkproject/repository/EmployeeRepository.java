package com.fsoft.carparkproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.fsoft.carparkproject.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long>{
}
	
