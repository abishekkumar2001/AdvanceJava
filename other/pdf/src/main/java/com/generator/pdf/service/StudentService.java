package com.generator.pdf.service;

import com.generator.pdf.entity.Student;
import com.lowagie.text.*;
import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
import com.lowagie.text.Font;
import com.lowagie.text.FontFactory;
import com.lowagie.text.Paragraph;
import com.lowagie.text.pdf.PdfWriter;
import org.springframework.stereotype.Service;

import java.io.ByteArrayOutputStream;
import java.util.List;

@Service
public class StudentService {

    public ByteArrayOutputStream generatePdf(List<Student> data) throws DocumentException {
        Document document = new Document();
        ByteArrayOutputStream out = new ByteArrayOutputStream();

        Font font = FontFactory.getFont(FontFactory.COURIER,12);

        PdfWriter.getInstance(document, out);
        document.open();

        Paragraph p = new Paragraph("Student",font);
        p.setAlignment(Paragraph.ALIGN_CENTER);
        document.add(p);

        String header = String.format("%-5s %-10s %-10s %-10s", "Id", "Name", "Gender", "Marks");
        document.add(new Paragraph(header, font));

        for (Student entity : data) {
            String line = String.format("%-5s %-10s %-10s %-10s", entity.getId(), entity.getName(), entity.getGender(), entity.getMarks());
            document.add(new Paragraph(line, font));
        }



        document.close();
        return out;
    }

}
