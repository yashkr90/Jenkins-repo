package com.ibm.Jenkinsdemo;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ibm.Jenkinsdemo.model.Student;
import com.ibm.Jenkinsdemo.repo.StudentRepository;

import jakarta.annotation.PostConstruct;
import lombok.AllArgsConstructor;

@SpringBootApplication
@AllArgsConstructor
public class JenkinsDemoApplication {

	private final StudentRepository studentRepository;
	public static void main(String[] args) {
		SpringApplication.run(JenkinsDemoApplication.class, args);
	}
	
	@PostConstruct
	public void init()
	{
		studentRepository.save(new Student("yash", "Kumar", "hjhj@hj.com"));
		studentRepository.save(new Student("Tanmk", "Qwer", "john@gmail.com"));
		studentRepository.save(new Student("kuchbhi", "john", "doee@hj.com"));
		
	}

}
