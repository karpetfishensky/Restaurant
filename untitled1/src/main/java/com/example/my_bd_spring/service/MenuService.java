package com.example.my_bd_spring.service;

import com.example.my_bd_spring.Table.Chef;
import com.example.my_bd_spring.Table.Menu;
import com.example.my_bd_spring.repositories.ChefRepository;
import com.example.my_bd_spring.repositories.MenuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MenuService {

    @Autowired
    private MenuRepository menuRepository;

    @Autowired
    private ChefRepository chefRepository;

    public Menu updateMenuItem(Menu menuItem, int chefId) {
        Chef chef = chefRepository.findById(chefId).orElseThrow(() -> new RuntimeException("Chef not found"));
        if (menuItem.getTypeOfCuisine().equals(chef.getTypeOfCuisine())) {
            return menuRepository.save(menuItem);
        } else {
            throw new RuntimeException("Chef not authorized to update this menu item");
        }
    }
}

