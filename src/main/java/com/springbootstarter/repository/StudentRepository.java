package com.springbootstarter.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springbootstarter.model.Student;

public interface StudentRepository extends JpaRepository<Student, String> {

}
