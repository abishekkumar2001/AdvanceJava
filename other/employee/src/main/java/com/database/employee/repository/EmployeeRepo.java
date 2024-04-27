package com.database.employee.repository;

import com.database.employee.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository<Employee,Integer> {

    Employee findByName(String name);

}