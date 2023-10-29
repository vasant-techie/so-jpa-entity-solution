package com.example.demo.service;

import com.example.demo.repository.EmployeeRepository;
import com.example.demo.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    EmployeeRepository empRepo;

    @Autowired
    public EmployeeService(EmployeeRepository empRepo) {
        this.empRepo = empRepo;
    }
    public List<Employee> getEmployees() {
        return empRepo.findAll();
    }
}
