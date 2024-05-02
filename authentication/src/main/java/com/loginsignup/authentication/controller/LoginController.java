package com.loginsignup.authentication.controller;

import com.loginsignup.authentication.dto.LoginRequestDTO;
import com.loginsignup.authentication.dto.SignUpRequestDTO;
import com.loginsignup.authentication.entity.User;
import com.loginsignup.authentication.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @Autowired
    private LoginService loginService;

    @PostMapping("/signup")
    public User signUp(@RequestBody SignUpRequestDTO signUpRequestDTO){
        return loginService.signUp(signUpRequestDTO);
    }

    @PostMapping("/login")
    public String login(@RequestBody LoginRequestDTO loginRequestDTO){
        return loginService.login(loginRequestDTO);
    }

}
