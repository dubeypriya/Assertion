package com.assertion.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
public class PasswordManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(PasswordManagementApplication.class, args);
	}

}
