package com.example.my_bd_spring.repositories;

import com.example.my_bd_spring.Table.Desk;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DeskRepository extends JpaRepository<Desk, Integer> {
    List<Desk> findByNumberOfSeats(int countOfVisitors); //TODO: Реализовать методы

    List<Desk> findClosestMatch(int countOfVisitors);
}
