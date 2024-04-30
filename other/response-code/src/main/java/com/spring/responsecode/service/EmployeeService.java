package com.spring.responsecode.service;

import com.spring.responsecode.entity.Employee;
import com.spring.responsecode.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepo employeeRepo;

    public List<Employee> getAllEmployee() {
        return employeeRepo.findAll();
    }

    public Employee addEmployee(Employee employee) {
        return employeeRepo.save(employee);
    }

    public Employee getEmployeeById(int id) {
        return employeeRepo.findById(id).get();
    }
}
