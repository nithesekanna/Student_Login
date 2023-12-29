package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {
	@Id
    private int id;
    private String name;
    private String std;

public Student() {
}

public Student(int id, String name, String std) {
	this.id = id;
	this.name = name;
	this.std = std;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getStd() {
	return std;
}

public void setStd(String std) {
	this.std = std;
}

@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + ", std=" + std + "]";
}


}
