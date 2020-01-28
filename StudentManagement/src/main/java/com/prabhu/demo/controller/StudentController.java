package com.prabhu.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.prabhu.demo.controller.repository.StudentRepo;
import com.prabhu.demo.datamodel.Student;
import com.prabhu.demo.exception.ResourceNotFoundException;

@RestController
@RequestMapping(path = "/studentService")
public class StudentController {
	@Autowired
	private StudentRepo studentRepo;

	// Find
	@GetMapping("/students")
	List<Student> findAll() {
		return studentRepo.findAll();
	}

	// Save
	@ResponseStatus(HttpStatus.CREATED)
	@PostMapping("/student")
	Student nStudent(@RequestBody Student nStud) {
		return studentRepo.save(nStud);
	}

	// update
	@PutMapping("/student/{studentId}")
	Student updateStudent(@PathVariable(name = "studentId") Long sId, @RequestBody Student nStud) {
		return studentRepo.findById(sId).map(s -> {
			s.setFirstName(nStud.getFirstName());
			s.setLastName(nStud.getLastName());
			s.setContact(nStud.getContact());
			s.setDob(nStud.getDob());
			s.setCourses(nStud.getCourses());
			return studentRepo.save(s);
		}).orElseThrow(() -> new ResourceNotFoundException("No student found for " + nStud.getId()));
	}
}
