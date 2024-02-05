package com.ibm.Jenkinsdemo.controller;

import org.springframework.web.bind.annotation.RestController;

import com.ibm.Jenkinsdemo.model.Student;
import com.ibm.Jenkinsdemo.service.StudentService;

import lombok.AllArgsConstructor;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@AllArgsConstructor
public class StudentController {

	
	private final StudentService studentService;
	
	@GetMapping("/")
	public List<Student> getAllStudents() {
		return studentService.getAllStudents();
	}
	
	@PostMapping("/")
	public Student createStudent(@RequestBody Student student) {
		//TODO: process POST request
		
		return studentService.createStudent(student);
	}
	
	
}
