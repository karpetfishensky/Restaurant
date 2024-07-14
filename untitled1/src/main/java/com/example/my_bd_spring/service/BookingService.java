package com.example.my_bd_spring.service;

import com.example.my_bd_spring.Table.Booking;
import com.example.my_bd_spring.Table.Desk;
import com.example.my_bd_spring.repositories.BookingRepository;
import com.example.my_bd_spring.repositories.DeskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class BookingService {

    private final DeskRepository deskRepository;
    private final BookingRepository bookingRepository;

    @Autowired
    public BookingService(DeskRepository deskRepository, BookingRepository bookingRepository) {
        this.deskRepository = deskRepository;
        this.bookingRepository = bookingRepository;
    }

    public List<Desk> findSuitableDesks(int countOfVisitors) {
        List<Desk> perfectMatch = deskRepository.findByNumberOfSeats(countOfVisitors);
        if (!perfectMatch.isEmpty()) {
            return perfectMatch;
        }
        return deskRepository.findClosestMatch(countOfVisitors); // Этот метод нужно будет реализовать в DeskRepository
    }

    public Booking bookDesk(Booking booking) {
        return bookingRepository.save(booking);
    }
}

