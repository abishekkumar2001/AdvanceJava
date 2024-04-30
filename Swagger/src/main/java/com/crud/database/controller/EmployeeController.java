package com.crud.database.controller;

import com.crud.database.entity.Employee;
import com.crud.database.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @RequestMapping("/employee")
    public List<Employee> getEmployeeDetails(){
        return employeeService.getEmployeeDetails();
    }

    @GetMapping("/employee/{id}")
    public Employee getEmployeeById(@PathVariable("id") int id){
        return employeeService.getEmployeeById(id);
    }

    @PostMapping("/employee")
    public Employee addEmployee(@RequestBody Employee employee){
        return employeeService.addEmployee(employee);
    }

    @PutMapping("/employee")
    public Employee updateEmployee(@RequestBody Employee emp){
        return employeeService.updateEmployee(emp);
    }

    @DeleteMapping("/employee/{empId}")
    public String deleteEmployee(@PathVariable("empId") int empId){
        return employeeService.deleteEmployee(empId);
    }

}
