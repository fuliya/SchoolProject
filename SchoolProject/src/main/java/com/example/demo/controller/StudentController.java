package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import com.example.demo.Model.Subject;
import com.example.demo.dao.SubjectDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.Model.Student;
import com.example.demo.dao.StudentDAO;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class StudentController {

    public StudentController(StudentDAO studentDAO, SubjectDAO subjectDAO) {
        this.studentDAO = studentDAO;
        this.subjectDAO = subjectDAO;
    }
@Autowired
    private StudentDAO studentDAO;
@Autowired
    private SubjectDAO subjectDAO;

    @RequestMapping(value = "/addStudent", method = RequestMethod.POST)
    public String createStudent(Student student, Model model) {
        if (student != null) {

            model.addAttribute("users", studentDAO.save(student));
        }
        return "addSuccess";
    }

    @RequestMapping(value = "/getStudent/{id}")
    public String retrieveStudent(@PathVariable Integer id, Model model) {
        Optional<Student> findOneStudent = studentDAO.findOneStudent(id);
        findOneStudent.ifPresent(o -> model.addAttribute("users", o));
        //model.addAttribute("users", findOneStudent);
        return "displayStudent";
    }

    @GetMapping(value = "/findAllStudent/classYear")
    public String findAllStudentByClass(Model model, String classYear) {
        List<Student> listCustomer = studentDAO.findAllStudentByClass(classYear);
        model.addAttribute("users", listCustomer);
        return "displayStudent";
    }

    @GetMapping(value = "/findAllStudent/firstName")
    public String findAllStudentByFirstName(Model model, String firstName) {
        List<Student> listCustomer = studentDAO.findAllStudentByFirstName(firstName);
        model.addAttribute("users", listCustomer);
        return "displayStudent";
    }

    @RequestMapping(value = "/addMark", method = RequestMethod.POST)
    private String addMark(@Valid Subject subject, Model model){
        model.addAttribute("subject", subjectDAO.save(subject));
        return "markSheet";
    }

    @RequestMapping(value = "/markform", method = RequestMethod.GET)
    public String addMark() {
        return "markForm";
    }

    @RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
    private String editStudent(@PathVariable String id, Model model) {
        model.addAttribute("subject", studentDAO.findOneStudent(Integer.parseInt(id)));
        return "Student_Registration";
    }
}
