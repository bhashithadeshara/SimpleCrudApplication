package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;
import com.example.demo.service.StudentService;

@RestController
@RequestMapping("student")
public class StudentController {

	@Autowired
	private StudentService studentService;
	
	@GetMapping("/getAllStudent")
	public Iterable<Student> getAll(){
		
		return studentService.getAllStudent();
	}
	
	@PostMapping("/addStudent")
	public String getStudent(@RequestBody Student student) {
		
		return studentService.getStudentById(student);
	}
	
	@GetMapping("/getStudent")
	public String getStudent(){
		
		return "Hello world";
	}
	
	@PutMapping("/updateStudent")
	public String updateStudent(@RequestBody Student student){
		
		return studentService.updateStudent(student);
	}
	
	@DeleteMapping("/deleteStudent/{id}")
	public String deleteStudent(@PathVariable String id){
		
		return studentService.deleteStudent(id);
	}
}
