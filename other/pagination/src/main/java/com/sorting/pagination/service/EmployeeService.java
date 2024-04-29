package com.sorting.pagination.service;

import com.sorting.pagination.entity.Employee;
import com.sorting.pagination.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepo employeeRepo;

    public List<Employee> getEmployeeDetails() {
        return employeeRepo.findAll();
    }

    public List<Employee> getEmployeeBySorting(String field) {
        return employeeRepo.findAll(Sort.by(field));
    }

    public Page<Employee> getEmployeeByPagination(int pageNo, int displaySize) {
        Page<Employee> page = employeeRepo.findAll(PageRequest.of(pageNo,displaySize));
        return page;
    }
}
