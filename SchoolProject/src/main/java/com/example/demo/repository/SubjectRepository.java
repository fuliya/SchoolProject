package com.example.demo.repository;

import com.example.demo.Model.Subject;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Component
@Repository
public interface SubjectRepository extends CrudRepository<Subject, Integer> {
}
