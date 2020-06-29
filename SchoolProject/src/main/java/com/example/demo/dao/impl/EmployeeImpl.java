package com.example.demo.dao.impl;

import com.example.demo.Model.Employee;
import com.example.demo.Model.Student;
import com.example.demo.dao.EmployeeDAO;
import com.example.demo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeImpl implements EmployeeDAO {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public Employee save(Employee emp) {
        if (emp.getFirstName() != null && emp.getEmpID() > 0) {
            employeeRepository.save(emp);
        }
        return emp;
    }

    @Override
    public Employee update(Employee employee) {
        return null;
    }

    @Override
    public void delete(int id) {

    }

    @Override
    public Optional findOneEmployee(int id) {
        return null;
    }

    @Override
    public List<Employee> findAllEmployee() {

        return (List<Employee>) employeeRepository.findAll();
    }

    @Override
    public List<Employee> findAllEmployeeByClass(String classYear) {
        return null;
    }
}
