package com.ibm.Jenkinsdemo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ibm.Jenkinsdemo.model.Student;
import com.ibm.Jenkinsdemo.repo.StudentRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class StudentServiceImpl implements StudentService {

	private final StudentRepository studentRepository;
	
	@Override
	public Student createStudent(Student student) {
		// TODO Auto-generated method stub
		return studentRepository.save(student);
	}

	@Override
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		return studentRepository.findAll();
	}

}
