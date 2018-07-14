package com.adrianbarczuk.restdemo.rest;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.adrianbarczuk.restdemo.entity.Student;

@RestController
@RequestMapping("/api")
public class StudentRestController {
	
	private List<Student> students;
	
	@PostConstruct
	public void loadData() {
		
		students = new ArrayList<>();
		students.add(new Student("Jan", "Kowalski"));
		students.add(new Student("Jerzy", "Iksinski"));
		students.add(new Student("Piotr", "Nowak"));
		
	}
	
	@GetMapping("/students")
	public List<Student> getStudents() {
		
		return students;
	}
	
	@GetMapping("/students/{studentId}")
	public Student getStudent(@PathVariable int studentId) {
		
		return students.get(studentId);
	}
	
}
