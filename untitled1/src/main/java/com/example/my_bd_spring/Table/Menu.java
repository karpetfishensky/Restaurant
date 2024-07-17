package com.example.my_bd_spring.Table;
import java.util.Set;

import jakarta.persistence.*;

@Entity
@Table(name = "Menu")
public class Menu extends BaseEntity {

    private String nameOfDish;
    private String typeOfDish;
    private float price;
    private Chef chef;
    private Set<LunchCombo> lunchCombo;

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
    @JoinColumn(name = "Chef", nullable = false)
    public Chef getTypeOfCuisine() {
        return chef;
    }
    public void setTypeOfCuisine(Chef typeOfCuisine) {
        this.chef = typeOfCuisine;
    }

    @ManyToMany
    @JoinTable(
            name = "Menu_Combo",
            joinColumns = @JoinColumn(name = "dish_id"),
            inverseJoinColumns = @JoinColumn(name = "dish_in_combo_id")
    )
    public Set<LunchCombo> getLunchCombo() {
        return lunchCombo;
    }
    public void setLunchCombo(Set<LunchCombo> lunchCombo) {
        this.lunchCombo = lunchCombo;
    }
}