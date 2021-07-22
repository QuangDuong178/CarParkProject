package com.fsoft.carparkproject.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employee")
public class Employee {
	
@Id
@GeneratedValue(
            strategy = GenerationType.IDENTITY
)
	private Long id;
	private String name;
	private LocalDate dob;
	private String sex;
	private String address;
	private String phone;
	private String email;
	private String account;
	private String password;
	
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
			String password) {
		this.id = id;
		this.name = name;
		this.dob = dob;
		this.sex = sex;
		this.address = address;
		this.phone = phone;
		this.email = email;
		this.account = account;
		this.password = password;
	}


	public Employee(String name, 
			LocalDate dob, 
			String sex, 
			String address, 
			String phone, 
			String email, 
			String account,
			String password) {
		this.name = name;
		this.dob = dob;
		this.sex = sex;
		this.address = address;
		this.phone = phone;
		this.email = email;
		this.account = account;
		this.password = password;
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
	
	
}
