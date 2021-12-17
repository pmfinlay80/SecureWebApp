package com.secureapp;

//Title:  Spring Boot Registration and Login with MySQL Database Tutorial
//Author: Ha Minh, Nam
//Date: 	 2021 
//Code version: Java
//Availability: https://www.codejava.net/frameworks/spring-boot/user-registration-and-login-tutorial

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

//Interface used to obtain user object details from database by email
public interface UserRepository extends JpaRepository<User, Long> {
	@Query("SELECT u FROM User u WHERE u.email = ?1")
	public User findByEmail(String email);

}