package com.example.my_bd_spring.Table;
import java.util.Set;

import jakarta.persistence.*;

@Entity
@Table(name = "Menu")
public class Menu extends BaseEntity {

    private String nameOfDish;
    private String typeOfDish;
    private float price;
    private Set<Chef> typeOfCuisine;
    private LunchCombo lunchCombo;

    public Menu(String nameOfDish, String typeOfDish, float price) {
        this.nameOfDish = nameOfDish;
        this.typeOfDish = typeOfDish;
        this.price = price;
    }

    @Column(name = "name_of_dish")
    public String getNameOfDish() {
        return nameOfDish;
    }
    public void setNameOfDish(String nameOfDish) {
        this.nameOfDish = nameOfDish;
    }

    @Column(name = "type_of_dish")
    public String getTypeOfDish() {
        return typeOfDish;
    }
    public void setTypeOfDish(String typeOfDish) {
        this.typeOfDish = typeOfDish;
    }

    @Column(name = "price")
    public float getPrice() {
        return price;
    }
    public void setPrice(float price) {
        price = Math.round(price*100)/100;
        this.price = price;
    }

    @ManyToOne(optional = false)
    public Set<Chef> getTypeOfCuisine() {
        return typeOfCuisine;
    }
    public void setTypeOfCuisine(Set<Chef> typeOfCuisine) {
        this.typeOfCuisine = typeOfCuisine;
    }

    @ManyToMany
    public LunchCombo getLunchCombo() {
        return lunchCombo;
    }
    public void setLunchCombo(LunchCombo lunchCombo) {
        this.lunchCombo = lunchCombo;
    }
}