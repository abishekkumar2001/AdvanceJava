package com.spring.validation.controller;

import com.spring.validation.dto.StudentDTO;
import com.spring.validation.entity.Student;
import com.spring.validation.service.StudentService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping("/all")
    public ResponseEntity<List<Student>>getStudents(){
        return ResponseEntity.ok(studentService.getStudents());
    }

    @PostMapping("/add")
    public ResponseEntity<Student> addStudent(@Valid @RequestBody StudentDTO studentDTO){
        return new ResponseEntity<>(studentService.addStudent(studentDTO), HttpStatus.CREATED);
    }

}
