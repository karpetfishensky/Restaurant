package com.example.my_bd_spring.service;

import com.example.my_bd_spring.Table.LunchCombo;
import com.example.my_bd_spring.repositories.LunchComboRepository;
import com.example.my_bd_spring.repositories.MenuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class LunchComboService {

    @Autowired
    private MenuRepository menuRepository;

    @Autowired
    private LunchComboRepository lunchComboRepository;

    public List<LunchCombo> findSuitableCombos(BigDecimal maxAmount, boolean isKidsCombo, String typeOfCuisine) {
        // Assuming we have some method to filter combos based on the criteria
        return lunchComboRepository.findCombos(maxAmount, isKidsCombo, typeOfCuisine);
    }
}

