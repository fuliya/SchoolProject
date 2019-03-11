package com.example.demo.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.Model.Student;
import com.example.demo.dao.StudentDAO;

@Controller
public class StudentController {

	@Autowired
 StudentDAO studentDAO;
	
@RequestMapping(value = "/addStudent", method =  RequestMethod.POST)
@ResponseBody
	public Student createStudent (Student s) {
	return studentDAO.save(s);
}

}
