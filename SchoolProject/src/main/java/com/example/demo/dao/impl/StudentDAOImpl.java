package com.example.demo.dao.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.Student;
import com.example.demo.dao.StudentDAO;
import com.example.demo.repository.StudentRepository;

@Service
public class StudentDAOImpl implements StudentDAO {
    @Autowired
    private StudentRepository studentRepository;

    @Override
    public Student save(Student s) {
        if (s.getFirstName().isEmpty() || s.getBirthdate().isEmpty()) {
            s = null;
        }
        return studentRepository.save(s);
    }

    @Override
    public Student update(Student st) {
        return null; //studentRepository.
    }

    @Override
    public void delete(int id) {
        studentRepository.deleteById(id);
    }

    @Override
    public Optional<Student> findOneStudent(int id) {
        return studentRepository.findById(id);
    }

    @Override
    public List<Student> findAllStudent() {
        return (List<Student>) studentRepository.findAll();
    }

    @Override
    public List<Student> findAllStudentByClass(String classYear) {
        List<Student> listByclass = new ArrayList<>();
        List<Student> studentList = (List<Student>) studentRepository.findAll();
        for (Student student : studentList){
            if(student.getClassYear().equalsIgnoreCase(classYear)){
                listByclass.add(student);
            }
        }
        return listByclass;
    }
    @Override
    public List<Student> findAllStudentByFirstName(String firstName) {
        List<Student> listByclass = new ArrayList<>();
        List<Student> studentList = (List<Student>) studentRepository.findAll();
        for (Student student : studentList){
            if(student.getFirstName().equalsIgnoreCase(firstName)){
                listByclass.add(student);
            }
        }
        return listByclass;
    }


}
