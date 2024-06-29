package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Student;
import com.example.demo.services.MainService;

import net.sf.jasperreports.engine.JRException;

@RestController
@RequestMapping("/control")
public class MainController {
	
	@Autowired
	private MainService service;
	
	@PostMapping("/addData")
	public ResponseEntity<Student> addData(@RequestBody Student data) {
		return service.addData(data);
	}
	
	@GetMapping("/getData")
	public String pdfGenarate() throws JRException {
		return service.pdfGenarate();
	}
	

}
