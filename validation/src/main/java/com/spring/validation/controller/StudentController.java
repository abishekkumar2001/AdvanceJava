package com.spring.validation.controller;

import com.spring.validation.dto.StudentDTO;
import com.spring.validation.entity.Student;
import com.spring.validation.service.StudentService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping("/all")
    public List<Student> getStudents(){
        return studentService.getStudents();
    }

    @PostMapping("/add")
    public Student addStudent(@Valid @RequestBody StudentDTO studentDTO){
        return studentService.addStudent(studentDTO);
    }

}
