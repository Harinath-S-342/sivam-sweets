package com.handson.sivamsweets.Service;

import com.handson.sivamsweets.Entity.RegistrationEntity;
import com.handson.sivamsweets.Repo.RegistrationRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegistrationService {
    @Autowired
    private RegistrationRepo registrationRepo;

    public RegistrationEntity newUserRegistration(RegistrationEntity registrationEntity){
        return registrationRepo.save(registrationEntity);
    }
}
