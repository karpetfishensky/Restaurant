package com.example.my_bd_spring.Table;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "Chef")
public class Chef extends BaseEntity{

    private String passport;
    private String fullName;
    private Integer experience;
    private String typeOfCuisine;
    private Restaurant restaurant;
    private Set<Menu> menu;

    public Chef(String passport, String fullName, Integer experience, String typeOfCuisine) {
        this.passport = passport;
        this.fullName = fullName;
        this.experience = experience;
        this.typeOfCuisine = typeOfCuisine;
    }
@Column(name = "passport")
    public String getPassport() {
        return passport;
    }
    public void setPassport(String passport) {
        this.passport = passport;
    }

    @Column(name = "full_name")
    public String getFullName() {
        return fullName;
    }
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    @Column(name = "experience")
    public Integer getExperience() {
        return experience;
    }
    public void setExperience(Integer experience) {
        this.experience = experience;
    }

    @Column(name = "type_of_cuisine")
    public String getTypeOfCuisine() {
        return typeOfCuisine;
    }
    public void setTypeOfCuisine(String typeOfCuisine) {
        this.typeOfCuisine = typeOfCuisine;
    }

    @ManyToOne(optional = false)
    @JoinColumn(name = "Restaurant", nullable = false)
    public Restaurant getRestaurant() {
        return restaurant;
    }
    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    @OneToMany(mappedBy = "Chef", targetEntity = Menu.class, fetch = FetchType.LAZY)
    public Set<Menu> getMenu() {
        return menu;
    }
    public void setMenu(Set<Menu> menu) {
        this.menu = menu;
    }
}