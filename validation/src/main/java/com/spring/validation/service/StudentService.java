package com.spring.validation.service;

import com.spring.validation.dto.StudentDTO;
import com.spring.validation.entity.Student;
import com.spring.validation.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepo studentRepo;

    Student student = new Student();

    public List<Student> getStudents() {
        return studentRepo.findAll();
    }

    public Student addStudent(StudentDTO studentDTO){

        student.setName(studentDTO.getName());
        student.setGender(studentDTO.getGender());
        student.setEmail(studentDTO.getEmail());
        student.setMarks(studentDTO.getMarks());
        student.setAge(studentDTO.getAge());
        student.setNationality(studentDTO.getNationality());

        return studentRepo.save(student);
    }
}
