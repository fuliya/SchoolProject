package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.Model.Student;
import org.springframework.stereotype.Component;

@Component
public interface StudentRepository extends CrudRepository<Student, Integer> {

}
