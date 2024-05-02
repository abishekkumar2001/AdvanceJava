package com.loginsignup.authentication.repository;

import com.loginsignup.authentication.dto.LoginRequestDTO;
import com.loginsignup.authentication.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoginRepo extends JpaRepository<User, Integer> {

    User findOneByEmailIdAndPassword(String emailId, String password);

}
