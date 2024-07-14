package com.example.my_bd_spring.repositories;

import com.example.my_bd_spring.Table.Administrator;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdministratorRepository extends JpaRepository<Administrator, Integer> {}
