package com.development.sivamsweets.controller;

import com.development.sivamsweets.entity.Login;
import com.development.sivamsweets.repository.LoginRepo;
import com.development.sivamsweets.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RestController
public class LoginController {
    @Autowired
    private LoginService loginService;

    @PostMapping("/login")
    public Login postLoginInfo(@RequestBody Login login){
        return loginService.addLoginDetails(login);
    }

    @GetMapping("/home")
    public String getHomepage(){
        return "home";
    }


}
