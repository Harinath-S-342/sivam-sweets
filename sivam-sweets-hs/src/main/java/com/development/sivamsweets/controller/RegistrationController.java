package com.development.sivamsweets.controller;

import com.development.sivamsweets.entity.Registration;
import com.development.sivamsweets.service.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RegistrationController {

    @Autowired
    private RegistrationService registrationService;

    @RequestMapping({"/","/register"})
    public String registration(){
        //return "Welcome to the Great Kirikaalan Show :-)";
        return "registration";
    }

    @PostMapping("/register")
    public Registration newRegUser(@RequestBody Registration registration){
        return registrationService.saveRegInfo(registration);
    }

//    @PostMapping("/registerAll")
//    public List<Registration> allRegUsers(@RequestBody List<Registration> allRegistration){
//        return registrationService.saveAllRegInfo(allRegistration);
//    }
}
