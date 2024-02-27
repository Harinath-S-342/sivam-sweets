package com.handson.sivamsweets.Controller;

import com.handson.sivamsweets.Service.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegistrationController {
    @Autowired
    private RegistrationService registrationService;

    @RequestMapping(value="registration")
    public String openRegPage(){
        return "registration";
    }

    @RequestMapping(value="login")
    public String openLoginPage(){
        return "login";
    }


}
