package com.example.demo.dao;


import com.example.demo.Model.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeDAO {
    Employee save(Employee emp);

    Employee update(Employee employee);

    void delete (int id);

    Optional findOneEmployee (int id);

    List<Employee> findAllEmployee ();

    List<Employee> findAllEmployeeByClass(String classYear);
}
