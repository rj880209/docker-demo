package com.example.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	static List<Student> students = new ArrayList<>();
	static {
		students.add(new Student(101l, "Raj", "Noida"));
		
	}
	

	@GetMapping("students")
	public List<Student> getStudentList() {
		return students;
	}

	@GetMapping("students/{id}")
	public Student getStudent(@PathVariable("id") Long id) {
		return students.stream().filter(e -> e.getId() == id).findFirst().get();
	}

	@PostMapping("students")
	public Student save(@RequestBody Student student) {
		students.add(student);
		return student;
	}

}
