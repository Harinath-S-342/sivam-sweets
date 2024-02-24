package com.development.sivamsweets.repository;

import com.development.sivamsweets.entity.Registration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegistrationRepo extends JpaRepository<Registration, Integer> {

    //Registration findByMobile(String customer_mobile);
}
