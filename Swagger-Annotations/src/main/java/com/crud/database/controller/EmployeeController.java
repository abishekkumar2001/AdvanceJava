package com.crud.database.controller;

import com.crud.database.entity.Employee;
import com.crud.database.service.EmployeeService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Tag(name = "Employee Controller", description = "Create, Read, Update and Delete")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @RequestMapping("/employee")
    @ApiResponses({
            @ApiResponse(responseCode = "200", description = "Successfully fetched all employees from database",
                    content = {@Content(schema = @Schema(implementation = Employee.class))}),
            @ApiResponse(responseCode = "404", description = "Details not found")
    })
    @Operation(summary = "Retrieve all users", description = "This endpoint will fetch all the details of an employee")
    public List<Employee> getEmployeeDetails(){
        return employeeService.getEmployeeDetails();
    }

    @GetMapping("/employee/{id}")
    @ApiResponses({
            @ApiResponse(responseCode = "200", description = "Successfully fetched the details of an employee from database"),
            @ApiResponse(responseCode = "404", description = "Details not found")
    })
    public Employee getEmployeeById(@PathVariable("id") int id){
        return employeeService.getEmployeeById(id);
    }

    @PostMapping("/employee")
    @ApiResponses({
            @ApiResponse(responseCode = "200", description = "Successfully created an employee in database"),
            @ApiResponse(responseCode = "404", description = "Details not found")
    })
    public Employee addEmployee(@RequestBody Employee employee){
        return employeeService.addEmployee(employee);
    }

    @PutMapping("/employee")
    @ApiResponses({
            @ApiResponse(responseCode = "200", description = "Successfully updated the details of an employee in database"),
            @ApiResponse(responseCode = "404", description = "Details not found")
    })
    public Employee updateEmployee(@RequestBody Employee emp){
        return employeeService.updateEmployee(emp);
    }

    @DeleteMapping("/employee/{empId}")
    @ApiResponses({
            @ApiResponse(responseCode = "200", description = "Successfully deleted an employee from database"),
            @ApiResponse(responseCode = "404", description = "Details not found")
    })
    public String deleteEmployee(@PathVariable("empId") int empId){
        return employeeService.deleteEmployee(empId);
    }

}
