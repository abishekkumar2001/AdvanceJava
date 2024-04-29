package com.spring.validation.dto;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentDTO {

    @NotNull(message = "Name field should be not null")
    private String name;

    @NotBlank(message = "Gender is required")
    private String gender;

    @Email(message = "Email field is required")
    private String email;

    @Max(500)
    private int marks;

    @Max(18)
    @Min(10)
    private int age;

    @NotEmpty(message = "Nationality should be entered")
    @Size(min = 2, max = 7, message = "Nationality should be between 2 to 7 characters")
    private String nationality;
}
