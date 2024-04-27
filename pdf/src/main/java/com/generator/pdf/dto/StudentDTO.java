package com.generator.pdf.dto;

import lombok.*;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class StudentDTO {

    private int id;
    private String name;
    private String gender;
    private int marks;

}
