package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;
import com.example.demo.service.EmployeeService;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeService eService;
//  @RequestMapping(value = "/employees",method = RequestMethod.GET)
//  @ResponseBody
    @GetMapping("/employees")
    public List<Employee> getEmployees() {
        return eService.getEmployees();
    }
    @GetMapping("/employee/{id}")
    public String getEmployee(@PathVariable Long id) {
        return "Details for: "+id;
    }
    @PostMapping("/employees")
    public String saveEmployee(@RequestBody Employee employee) {
        return "Saving employee details to the db "+ employee;
    }
    @PutMapping("/employee/{id}")
    public Employee updateemployee(@PathVariable Long id, @RequestBody Employee employee) {
        System.out.print("Update details for"+id);
        return employee;
    }
    @DeleteMapping ("/employee")
    public String deleteEmployee(@RequestParam Long id) {
        return "Details for: "+id;
    }
}