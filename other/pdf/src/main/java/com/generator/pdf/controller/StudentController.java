package com.generator.pdf.controller;

import com.generator.pdf.entity.Student;
import com.generator.pdf.repository.StudentRepo;
import com.generator.pdf.service.StudentService;
import com.lowagie.text.DocumentException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class StudentController {

    @Autowired
    private StudentRepo studentRepo;

    @Autowired
    private StudentService studentService;

    @GetMapping("/generate-pdf")
    public ResponseEntity<ByteArrayResource> generatePdf() throws DocumentException, IOException {
        List<Student> data = studentRepo.findAll(); // Fetch data from the database

        ByteArrayOutputStream bis = studentService.generatePdf(data);

        HttpHeaders headers = new HttpHeaders();
        //headers.add("Content-Disposition", "inline; filename=example.pdf");
        headers.add("Content-Disposition", "attachment; filename=StudentDetails.pdf");
        return ResponseEntity
                .ok()
                .headers(headers)
                .contentType(MediaType.APPLICATION_PDF)
                .body(new ByteArrayResource(bis.toByteArray()));

    }

}
