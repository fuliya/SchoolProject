package com.example.demo.dao;

import java.util.List;
import java.util.Optional;

import com.example.demo.Model.Student;

public interface StudentDAO {
	
	Student save(Student s);
	
	Student update(Student st);
	
	void delete (int id);
		
	Optional findOneStudent (int id);
	
	List<Student> findAllStudent (Student s);
	
}
