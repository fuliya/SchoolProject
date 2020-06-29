package com.example.demo.controller;

import com.example.demo.Model.Student;
import com.example.demo.dao.StudentDAO;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class StudentRestController {


    private StudentDAO studentDAO;

    public StudentRestController(StudentDAO studentDAO) {
        this.studentDAO = studentDAO;
    }

    @RequestMapping(value = "/queryByPage", method = RequestMethod.GET)
    @ResponseBody
    public List<Student> findAllStudent(){
        return studentDAO.findAllStudent();
    }
}
