package com.example.demo.dao.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.Student;
import com.example.demo.dao.StudentDAO;
import com.example.demo.repository.StudentRepository;

@Service
public class StudentDAOImpl implements StudentDAO {
	@Autowired StudentRepository studentRepository;
	@Override
	public Student save(Student s) {
		if(s.getFirstName().isEmpty() || s.getBirthdate().isEmpty()) {
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
	public List<Student> findAllStudent(Student s) {
		return (List<Student>)studentRepository.findAll();
	}
}
