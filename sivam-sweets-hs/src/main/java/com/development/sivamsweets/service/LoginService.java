package com.development.sivamsweets.service;

import com.development.sivamsweets.entity.Login;
import com.development.sivamsweets.repository.LoginRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoginService {
    @Autowired
    private LoginRepo loginRepo;

    public Login addLoginDetails(Login login){
        return loginRepo.save(login);
    }

    public Login getLoginDetails(int login_id){
        return loginRepo.findById(login_id).orElse(null);
    }

    public List<Login> getAllLoginInfo(List<Login> login){
        return loginRepo.findAll();
    }

}
