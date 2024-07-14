package com.example.my_bd_spring.repositories;

import com.example.my_bd_spring.Table.Chef;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChefRepository extends JpaRepository<Chef, Integer> {}
