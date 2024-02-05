package com.ibm.Jenkinsdemo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ibm.Jenkinsdemo.model.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
