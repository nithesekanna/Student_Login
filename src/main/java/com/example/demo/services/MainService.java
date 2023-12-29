package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Student;
import com.example.demo.repostory.StudentRepo;

@Service
public class MainService {
	
	@Autowired
	private StudentRepo repo;
	
	public ResponseEntity<Student> addData(Student data){
		repo.save(data);
		return ResponseEntity.ok(data);
	}

}
