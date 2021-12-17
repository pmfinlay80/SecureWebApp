package com.secureapp;

//Title:  Spring Boot Registration and Login with MySQL Database Tutorial
//Author: Ha Minh, Nam
//Date: 	 2021 
//Code version: Java
//Availability: https://www.codejava.net/frameworks/spring-boot/user-registration-and-login-tutorial

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AppController {

	// Mapping custom login page to open as home page, overwriting the default
	// Spring login page
	@GetMapping({ "/", "/login" })
	public String viewHomePage() {
		return "login";
	}

	// Mapping login to generate a new session each time page loads if not new
	// Invalidate prvious session if any
	@RequestMapping(value = "/login")
	public String login(HttpServletRequest request, HttpSession session) {

		if (!session.isNew()) {
			session.invalidate();
		}
		return "login";
	}

	// Mapping account page
	@RequestMapping("/account")
	public String welcome() {
		return "/account";
	}

	// mapping submit function on order form
	@RequestMapping("/order")
	public String order() {
		return "/account";
	}

	// mapping submit function on credit application form
	@RequestMapping("/credit")
	public String credit() {
		return "/account";
	}

}
