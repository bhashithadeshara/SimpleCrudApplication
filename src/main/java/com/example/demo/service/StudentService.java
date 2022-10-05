package com.example.demo.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepository;

@Service
public class StudentService {

	@Autowired
	private StudentRepository studentRepository;
	
	public Iterable<Student> getAllStudent(){
		
		return studentRepository.findAll();
	}
	
	public String getStudentById(Student student) {
		
		studentRepository.save(student);
		
		return "Student added Successfully";
	   
	}
	
	public String updateStudent(Student student) {
		
		studentRepository.save(student);
		return "Student updated Successfully";
	}
	
	public String deleteStudent(String id) {
		
		studentRepository.deleteById(id);
		return "Student deleted Successfully";
	}
}
