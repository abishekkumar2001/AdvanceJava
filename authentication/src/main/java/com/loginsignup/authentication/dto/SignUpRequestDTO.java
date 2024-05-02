package com.loginsignup.authentication.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class SignUpRequestDTO {

    private String name;
    private String gender;
    private String emailId;
    private String phoneNumber;
    private String password;

}
