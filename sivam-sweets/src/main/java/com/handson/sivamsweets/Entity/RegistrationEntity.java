package com.handson.sivamsweets.Entity;

import com.fasterxml.jackson.annotation.JsonTypeId;
import org.springframework.stereotype.Repository;

import jakarta.persistence.*;

@Entity
public class RegistrationEntity {
    @Id
    @GeneratedValue
    private int customer_id;
    private String customer_name;
    private String customer_email;
    private String customer_mobile;
    private String place;
    private String password;
}
