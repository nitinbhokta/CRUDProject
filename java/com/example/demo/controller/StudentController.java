package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Student;
import com.example.demo.repo.StudentRepository;

@RestController
public class StudentController {
	
	@Autowired
	StudentRepository repos;
	
	
	@PostMapping("student/add")
	public ResponseEntity<Student> createStudent(@RequestBody Student student) {
		
		Student nwstudent = repos.save(student);
	
		return ResponseEntity.status(HttpStatus.CREATED).body(nwstudent);
	}
	
	
//	@PutMapping("/student/update'{id}")
//	public Student UpdateStudents(@PathVariable int id) {
//		Student student = repos.findById((long) id).get();
//		student.setName("Nitin Kumar");
//		repos.save(student);
//		return student;
//	}
	
	 @GetMapping("/student/get")
	    public List<Student> getAllStudents() {
	        return repos.findAll();
	    }
//	
//	@DeleteMapping("/student/delete/{id}")
//	@ResponseStatus(code = HttpStatus.NO_CONTENT)
//	
	
	
}

