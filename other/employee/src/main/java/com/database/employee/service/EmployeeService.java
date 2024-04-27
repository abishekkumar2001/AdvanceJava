package com.database.employee.service;

import com.database.employee.entity.Employee;
import com.database.employee.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepo employeeRepo;

    public List<Employee> getEmployeeDetails() {
        return employeeRepo.findAll();
    }

    public Employee getEmployeeById(int id) {
        return employeeRepo.findById(id).get();
    }

    public Employee addEmployee(Employee employee) {
        return employeeRepo.save(employee);
    }

    public Employee updateEmployee(Employee emp) {
        return employeeRepo.save(emp);
    }

    public String deleteEmployee(int empId) {
        employeeRepo.deleteById(empId);
        return "Deleted Successfully";
    }

    public Employee getEmployeeByName(String name) {
        return employeeRepo.findByName(name);
    }
}
