package com.example.my_bd_spring.service;

import com.example.my_bd_spring.Table.Chef;
import com.example.my_bd_spring.repositories.ChefRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdministratorService {

    @Autowired
    private ChefRepository chefRepository;

    public Chef hireChef(Chef chef, int requiredExperience) {
        if (chef.getExperience() >= requiredExperience) {
            return chefRepository.save(chef);
        } else {
            throw new RuntimeException("Chef does not have enough experience");
        }
    }
}

