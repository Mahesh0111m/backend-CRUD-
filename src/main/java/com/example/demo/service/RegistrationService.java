package com.example.demo.service;

import com.example.demo.model.Registration;
import com.example.demo.repo.RegistrationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RegistrationService {

    @Autowired
    private RegistrationRepository registrationRepository;

    // CREATE
    public Registration createRegistration(Registration registration) {
        return registrationRepository.save(registration);
    }

    // READ (all)
    public List<Registration> getAllRegistrations() {
        return registrationRepository.findAll();
    }

    // READ (by id)
    public Optional<Registration> getRegistrationById(Integer id) {
        return registrationRepository.findById(id);
    }

    // UPDATE
    public Optional<Registration> updateRegistration(Integer id, Registration updatedRegistration) {
        return registrationRepository.findById(id).map(registration -> {
            registration.setName(updatedRegistration.getName());
            registration.setEmail(updatedRegistration.getEmail());
            registration.setDateOfBirth(updatedRegistration.getDateOfBirth());
            return registrationRepository.save(registration);
        });
    }

    // DELETE
    public boolean deleteRegistration(Integer id) {
        return registrationRepository.findById(id).map(registration -> {
            registrationRepository.delete(registration);
            return true;
        }).orElse(false);
    }
}
