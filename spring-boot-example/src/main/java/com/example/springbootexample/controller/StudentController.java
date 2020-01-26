package com.example.springbootexample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.example.springbootexample.model.Student;
import com.example.springbootexample.model.StudentRepository;

@Controller
public class StudentController {

	@Autowired
	StudentRepository repository;
	
	@RequestMapping("/")
	public String home()
	{
		return "home.jsp";
	}
	
	@RequestMapping("/addStudent")
	public String AddStudent(Student student)
	{
		repository.save(student);
		return "display.jsp";
	}
}
