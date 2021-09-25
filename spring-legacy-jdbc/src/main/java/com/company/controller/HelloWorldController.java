package com.company.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.company.model.Student;
import com.company.model.StudentRepository;

@Controller
public class HelloWorldController {

	@Autowired
    private StudentRepository studentRepository;
	
	@RequestMapping("/hello")
	public void showMessage(HttpServletResponse response) throws IOException {
		System.out.println("From controller..");
		List<Student> list = studentRepository.findAll();
		
		for(Student student : list) {
			System.out.println(student);
		}
		
		response.getWriter().println("<h3>" + list +"</h3>");
		
	}
}
