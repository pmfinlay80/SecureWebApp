package com.secureapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

//Main Class to run application
@SpringBootApplication
@EnableJpaRepositories(basePackageClasses = UserRepository.class)
public class SecureWebAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SecureWebAppApplication.class, args);
	}

}
