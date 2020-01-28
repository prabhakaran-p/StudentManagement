package com.prabhu.demo.controller.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prabhu.demo.datamodel.Student;

// For CURD Operations
public interface StudentRepo extends JpaRepository<Student, Long> {

}
