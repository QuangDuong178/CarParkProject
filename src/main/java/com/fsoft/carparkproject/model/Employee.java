package com.fsoft.carparkproject.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
@Table(name = "employee")
public class Employee {
	
@Id
@GeneratedValue(
            strategy = GenerationType.IDENTITY
)
	private Long id;

	@NotNull(message = "Name cannot be null")
	@Size(max=50, message="Name length max 50")
	@Pattern(regexp="^(?=.*[a-z]).{1,50}$", message="Name is invalid")
	private String name;
	
	@NotNull(message = "DOB cannot be null")
	private LocalDate dob;
	
	private String sex;
	
	@Size(max=50, message="Address length max 50") 
	private String address;
	
	@NotNull(message = "Phone cannot be null")
	@Pattern(regexp="^[0-9]{10,11}$", message="Phone must be sequence of 10-11 digits") 
	private String phone;
	
	@Email(message = "Email should be valid")
	
	private String email;
	
	@NotNull(message = "Account cannot be null")
	@Size(max=50, message="Account length max 50") 
	private String account;
	
	@NotNull(message = "Password cannot be null")
	@Pattern(regexp="^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{6,100}$", message="Password is invalid")
	private String password;
	
	@NotNull(message = "Department cannot be null")
	private String department;
	
	public Employee() {
		
	}
	
	public Employee(Long id, 
			String name, 
			LocalDate dob, 
			String sex, 
			String address, 
			String phone, 
			String email,
			String account, 
			String password,
			String department) {
		this.id = id;
		this.name = name;
		this.dob = dob;
		this.sex = sex;
		this.address = address;
		this.phone = phone;
		this.email = email;
		this.account = account;
		this.password = password;
		this.department=department;
	}


	public Employee(String name, 
			LocalDate dob, 
			String sex, 
			String address, 
			String phone, 
			String email, 
			String account,
			String password,
			String department) {
		this.name = name;
		this.dob = dob;
		this.sex = sex;
		this.address = address;
		this.phone = phone;
		this.email = email;
		this.account = account;
		this.password = password;
		this.department=department;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public LocalDate getDob() {
		return dob;
	}


	public void setDob(LocalDate dob) {
		this.dob = dob;
	}


	public String getSex() {
		return sex;
	}


	public void setSex(String sex) {
		this.sex = sex;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getAccount() {
		return account;
	}


	public void setAccount(String account) {
		this.account = account;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
	
	
}
