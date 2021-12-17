package com.secureapp;

//Title:  Spring Boot Registration and Login with MySQL Database Tutorial
//Author: Ha Minh, Nam
//Date: 	 2021 
//Code version: Java
//Availability: https://www.codejava.net/frameworks/spring-boot/user-registration-and-login-tutorial

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//User Object mapped to fields in database table
@Entity
@Table(name = "customers")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "email")
	private String email;

	@Column(name = "pass")
	private String password;

	@Column(name = "account_type")
	private String type;

	@Column(name = "enabled")
	private Boolean status;

	@Column(name = "role")
	private String role;

	// Getters & Setters for each database element
	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

}
