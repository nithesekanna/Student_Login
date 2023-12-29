package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.controller.MainController;

@SpringBootApplication
public class StudentLoginApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentLoginApplication.class, args);
	}

}
