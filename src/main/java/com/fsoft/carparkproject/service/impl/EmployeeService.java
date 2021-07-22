package com.fsoft.carparkproject.service.impl;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fsoft.carparkproject.model.Employee;
import com.fsoft.carparkproject.repository.EmployeeRepository;
import com.fsoft.carparkproject.service.interfaces.IEmployeeService;

@Service
public class EmployeeService implements IEmployeeService {
private final EmployeeRepository employeeRepository;
private final ModelMapper mapper;
@Autowired
public EmployeeService ( EmployeeRepository employeeRepository, 
		                 ModelMapper mapper) {
	this.employeeRepository = employeeRepository;
	this.mapper = mapper;
}

	@Override
	public List<Employee> getAllEmployee() {
		return employeeRepository.findAll();
	}

	@Override
	public void addEmployee(Employee employee) {
		employeeRepository.save(employee);
	}

	@Override
	public void updateEmployee(Long id, Employee replaceEmployee) {
		  Employee  newEmployee1 = employeeRepository.findById(id).orElseThrow(()-> new IllegalStateException("Office with id "+ id + " does not exist"));
	    Employee newEmployee = mapper.map(replaceEmployee, Employee.class);
	     newEmployee.setId(id);
		  employeeRepository.save(newEmployee);
	}

	@Override
	public void deleteEmployee(Long id) {
		boolean exits = employeeRepository.existsById(id);
		  if (!exits) {
			  throw new IllegalStateException(
					  "Student with id" + id + "does not exist");
		  }
		  employeeRepository.deleteById(id);
	}
	

}
