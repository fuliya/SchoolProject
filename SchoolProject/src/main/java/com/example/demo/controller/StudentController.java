package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
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
	public String createStudent (@Valid Student student, BindingResult result, Model model) {
	if(student !=null ) {
	
	model.addAttribute("users", studentDAO.save(student));
	}
	 return "addSuccess";
}

@RequestMapping(value = "/getStudent")
@ResponseBody
public Optional<Student> retrieveStudent (int id){
	Optional<Student> findOneStudent = studentDAO.findOneStudent(id);
	return findOneStudent;
}

	/*
	 * @PostMapping("/update") public String updateStudent(@PathVariable ("id") int
	 * id, Student s) { return "addSuccess"; }
	 */
@GetMapping(value= "/findAllStudent")
public String findAllStudent(Student s, Model model){
    List<Student> listCustomer =studentDAO.findAllStudent();
    model.addAttribute("users", listCustomer);
    return "displayStudent";
	
}
}
