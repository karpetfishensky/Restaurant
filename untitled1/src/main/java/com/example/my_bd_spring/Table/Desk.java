package com.example.my_bd_spring.Table;

import jakarta.persistence.*;

import java.util.Set;


@Entity
@Table(name = "Desk")
public class Desk extends BaseEntity {

    private Integer number_of_seats;
    private Restaurant restaurant;
    private Set<Booking> booking;

    public Desk(Integer numberOfSeats) {
        this.number_of_seats = numberOfSeats;
    }

    @Column(name = "number_of_seats")
    public Integer getNumberOfSeats() {
        return number_of_seats;
    }
    public void setNumberOfSeats(Integer numberOfSeats) {
        this.number_of_seats = numberOfSeats;
    }

    @ManyToOne(optional = false)
    @JoinColumn(name = "Restaurant", nullable = false)
    public Restaurant getRestaurant() {
        return restaurant;
    }
    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    @OneToMany(mappedBy = "Desk", targetEntity = Booking.class, fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    public Set<Booking> getBooking() {
        return booking;
    }
    public void setBooking(Set<Booking> booking) {
        this.booking = booking;
    }
}