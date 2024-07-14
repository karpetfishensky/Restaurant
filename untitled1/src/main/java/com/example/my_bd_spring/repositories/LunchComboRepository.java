package com.example.my_bd_spring.repositories;

import com.example.my_bd_spring.Table.LunchCombo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;

@Repository
public interface LunchComboRepository extends JpaRepository<LunchCombo, Integer> {
    List<LunchCombo> findCombos(BigDecimal maxAmount, boolean isKidsCombo, String typeOfCuisine); //TODO: реализовать метод
}
