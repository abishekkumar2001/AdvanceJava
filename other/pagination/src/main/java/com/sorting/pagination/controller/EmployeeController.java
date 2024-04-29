package com.sorting.pagination.controller;

import com.sorting.pagination.entity.Employee;
import com.sorting.pagination.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @RequestMapping("/employee")
    public List<Employee> getEmployeeDetails(){
        return employeeService.getEmployeeDetails();
    }

    @GetMapping("/employee/{field}")
    public List<Employee> getEmployeeBySorting(@PathVariable String field){
        return employeeService.getEmployeeBySorting(field);
    }

    @GetMapping("/employee/pagination/{pageNo}/{displaySize}")
    public Page<Employee> getEmployeeByPagination(@PathVariable int pageNo, @PathVariable int displaySize){
        return employeeService.getEmployeeByPagination(pageNo,displaySize);
    }

}
