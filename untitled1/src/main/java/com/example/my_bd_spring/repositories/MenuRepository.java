package com.example.my_bd_spring.repositories;

import com.example.my_bd_spring.Table.Menu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MenuRepository extends JpaRepository<Menu, Integer> {}
