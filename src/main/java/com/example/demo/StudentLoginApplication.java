package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import net.sf.jasperreports.engine.JRException;

@SpringBootApplication
public class StudentLoginApplication {

	public static void main(String[] args) throws JRException {
		SpringApplication.run(StudentLoginApplication.class, args);
	
		
	}

}
