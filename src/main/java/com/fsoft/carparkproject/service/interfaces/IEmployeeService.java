package com.fsoft.carparkproject.service.interfaces;

import java.util.List;

import com.fsoft.carparkproject.dto.EmployeeDTO;
import com.fsoft.carparkproject.model.Employee;

public interface IEmployeeService {
	List<Employee> getAllEmployee();
	void addEmployee(Employee employee);
	void updateEmployee(Long id, Employee employee);
	void deleteEmployee(Long id);

}
