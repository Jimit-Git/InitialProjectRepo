package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class InitialProjectApplication {

	public static void main(String[] args) {
		System.out.println("The application is running fine...");
		System.out.println("This is the change in the file to commit...");
		SpringApplication.run(InitialProjectApplication.class, args);
	}
		
}
