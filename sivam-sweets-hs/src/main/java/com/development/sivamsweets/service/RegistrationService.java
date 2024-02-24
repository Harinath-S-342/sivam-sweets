package com.development.sivamsweets.service;

import com.development.sivamsweets.entity.Registration;
import com.development.sivamsweets.repository.RegistrationRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RegistrationService {
    @Autowired
    private RegistrationRepo registrationRepo;

    public Registration saveRegInfo(Registration registration){
        return registrationRepo.save(registration);
    }
    public List<Registration> saveAllRegInfo(List<Registration> allRegistration){
        return registrationRepo.saveAll(allRegistration);
    }

    public List<Registration> getAllRegInfo(Registration registration){
        return registrationRepo.findAll();
    }

    public Registration getOneRegInfo(int customer_id){
        return registrationRepo.findById(customer_id).orElse(null);
    }

//    public Registration getOneMobInfo(String customer_mobile){
//        return registrationRepo.findByMobile(customer_mobile);
//    }

    public String deleteReg(int customer_id){
        registrationRepo.deleteById(customer_id);
        return "Success ! Deleted User "+customer_id;
    }

    public Registration deleteReg(Registration registration){
        Registration existingUser=registrationRepo.findById(registration.getCustomer_id()).orElse(null);
        existingUser.setCustomer_name(registration.getCustomer_name());
        existingUser.setCustomer_email(registration.getCustomer_email());
        existingUser.setPlace(registration.getPlace());
        existingUser.setPassword(registration.getPassword());
        existingUser.setCustomer_mobile(registration.getCustomer_mobile());

        return registrationRepo.save(existingUser);

    }


}
