package com.example.demo.repo;

import com.example.demo.model.Registration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.ResponseBody;

@Repository
public interface RegistrationRepository extends JpaRepository<Registration,Integer> {
}
