package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class InitialProjectApplication {
//This is the first change done one the branch
	public static void main(String[] args) {
		System.out.println("The application is running fine...");
		System.out.println("This is the change in the file to commit...");
		System.out.println("This is the change in the file to commit2...");
		SpringApplication.run(InitialProjectApplication.class, args);
	}
		
}
