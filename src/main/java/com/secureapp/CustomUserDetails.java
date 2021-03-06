package com.secureapp;

//MODIFIED FROM 
//Title:  Spring Boot Registration and Login with MySQL Database Tutorial
//Author: Ha Minh, Nam
//Date: 	 2021 
//Code version: Java
//Availability: https://www.codejava.net/frameworks/spring-boot/user-registration-and-login-tutorial

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

//Default Container to store user information to be implemented by Authentication objects
public class CustomUserDetails implements UserDetails {

	/**
	* 
	*/
	private static final long serialVersionUID = 1L;
	private User user;

	public CustomUserDetails(User user) {
		this.user = user;
	}

	@Override
	public String getPassword() {
		return user.getPassword();
	}

	@Override
	public String getUsername() {
		return user.getEmail();
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		return null;
	}

}
