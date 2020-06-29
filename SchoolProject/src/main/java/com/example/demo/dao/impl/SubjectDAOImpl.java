package com.example.demo.dao.impl;

import com.example.demo.Model.Subject;
import com.example.demo.dao.SubjectDAO;
import com.example.demo.repository.SubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SubjectDAOImpl implements SubjectDAO {

    @Autowired
    private SubjectRepository subjectRepository;


    @Override
    public Subject save(Subject subject) {
        return subjectRepository.save(subject);
    }
}
