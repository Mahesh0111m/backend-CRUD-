package com.example.demo.repo;

import com.example.demo.model.Registration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.ResponseBody;

@ResponseBody
public interface RegistrationRepository extends JpaRepository<Registration,Integer> {

}
