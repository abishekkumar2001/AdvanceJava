package com.loginsignup.authentication.service;

import com.loginsignup.authentication.dto.LoginRequestDTO;
import com.loginsignup.authentication.dto.SignUpRequestDTO;
import com.loginsignup.authentication.entity.User;
import com.loginsignup.authentication.repository.LoginRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {

    @Autowired
    private LoginRepo loginRepo;

    public User signUp(SignUpRequestDTO signUpRequestDTO) {

        User user = new User();

        user.setName(signUpRequestDTO.getName());
        user.setGender(signUpRequestDTO.getGender());
        user.setEmailId(signUpRequestDTO.getEmailId());
        user.setPhoneNumber(signUpRequestDTO.getPhoneNumber());
        user.setPassword(signUpRequestDTO.getPassword());

        return loginRepo.save(user);
    }

    public String login(LoginRequestDTO loginRequestDTO) {
        User user = loginRepo.findOneByEmailIdAndPassword(loginRequestDTO.getEmailId(),loginRequestDTO.getPassword());
        if(user == null){
            return "Login Failed";
        }
        return "Successfully Logged In";
    }
}
