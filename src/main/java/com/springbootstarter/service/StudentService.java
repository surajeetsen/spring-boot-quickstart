package com.springbootstarter.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springbootstarter.model.Student;
import com.springbootstarter.repository.StudentRepository;

@Service
public class StudentService {
	
	@Autowired
	private StudentRepository studentRepository;
	
	public List<Student> getAllStudents() {
		List<Student> students = new ArrayList<>();
		studentRepository.findAll().forEach(students::add);
		return students;
	}
	
	public Student getStudent(String id) {
		return studentRepository.findOne(id);
	}
	
	public void addStudent(Student student) {
		studentRepository.save(student);
	}
	
	public void deleteStudent(String id) {
		studentRepository.delete(id);
	}
	
}
