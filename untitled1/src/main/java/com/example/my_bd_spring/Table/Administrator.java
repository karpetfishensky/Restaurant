package com.example.my_bd_spring.Table;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "Administrator")
public class Administrator extends BaseEntity {

    private String phone_number;
    private String full_name;
    private String passport;
    private Restaurant restaurant;

    public Administrator(String phoneNumber, String fullName, String passport){
        this.phone_number = phoneNumber;
        this.full_name = fullName;
        this.passport = passport;
    }

    @Column(name = "phone_number")
    public String getPhoneNumber() {
        return phone_number;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phone_number = phoneNumber;
    }

    @Column(name = "full_name")
    public String getFullName() {
        return full_name;
    }
    public void setFullName(String fullName) {
        this.full_name = fullName;
    }

    @Column(name = "passport")
    public String getPassport() {
        return passport;
    }
    public void setPassport(String passport) {
        this.passport = passport;
    }

    @ManyToOne(optional = false)
    @JoinColumn(name = "restaurant_id", referencedColumnName = "id")
    public Restaurant getRestaurant() {
        return restaurant;
    }
    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }
}
