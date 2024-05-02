package com.loginsignup.authentication.entity;

import com.loginsignup.authentication.common.Constant;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Entity
@Table(name = "user")
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String gender;
    private String emailId;
    private String phoneNumber;
    private String userType = Constant.USER_TYPE.NORMAL;
    private String password;
    private Boolean isActive = true;
    private Integer login = 0;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(nullable = false)
    private Date loginAt;

    private Date createdAt;
    private Date updatedAt;


    @PrePersist
    private void onCreate(){
        loginAt = new Date();
        createdAt = new Date();
        updatedAt = new Date();
    }

    @PostPersist
    private void onUpdate(){
        loginAt = new Date();
        updatedAt = new Date();
    }


}
