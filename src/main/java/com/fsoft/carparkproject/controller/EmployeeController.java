package com.fsoft.carparkproject.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fsoft.carparkproject.dto.EmployeeDTO;
import com.fsoft.carparkproject.dto.OfficeDTO;
import com.fsoft.carparkproject.model.Employee;
import com.fsoft.carparkproject.model.Office;
import com.fsoft.carparkproject.service.interfaces.IEmployeeService;
import com.fsoft.carparkproject.service.interfaces.IOfficeService;

@RestController
@RequestMapping("employee")
public class EmployeeController {
	 private final IEmployeeService employeeService;
	    @Autowired
	    public EmployeeController(IEmployeeService employeeService) {
	        this.employeeService = employeeService;
	    }
	    @GetMapping("/all")
	    public List<Employee> getAllEmployee(){
	        return employeeService.getAllEmployee();
	    }
	    @PostMapping("/insert")
	    public void insertOffice(@RequestBody @Valid Employee employee){
	    	employeeService.addEmployee(employee);
	    }
	    @DeleteMapping(path = "/delete/{id}")
	    public void deleteEmployee(@PathVariable("id") Long id){
	    	employeeService.deleteEmployee(id);
	    }
	    @PutMapping(path = "/update/{id}")
	    public void updateEmployee(@PathVariable("id") Long id, @RequestBody Employee employee){
	    	employeeService.updateEmployee(id,employee);
	    }

}
