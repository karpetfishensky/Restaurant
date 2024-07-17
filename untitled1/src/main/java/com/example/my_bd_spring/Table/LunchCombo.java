package com.example.my_bd_spring.Table;

import java.util.Set;

import jakarta.persistence.*;

@Entity
@Table(name = "LunchCombo")
public class LunchCombo extends BaseEntity{

    private float maxAmount;
    private boolean isKidsCombo;
    private Set<Menu> mainDishID;
    private Set<Menu> appetizerDishID;
    private Set<Menu> drinkDishID;
    private Set<Menu> dessertDishID;

    public LunchCombo(float maxAmount, boolean isKidsCombo) {
        this.maxAmount = maxAmount;
        this.isKidsCombo = isKidsCombo;
    }

    @Column(name = "max_amount")
    public float getMaxAmount() {
        return maxAmount;
    }
    public void setMaxAmount(float maxAmount) {
        maxAmount = Math.round(maxAmount*100)/100;
        this.maxAmount = maxAmount;
    }

    @Column(name = "is_kids_combo")
    public boolean isKidsCombo() {
        return isKidsCombo;
    }
    public void setKidsCombo(boolean kidsCombo) {
        isKidsCombo = kidsCombo;
    }

    @ManyToMany(mappedBy = "LunchCombo", targetEntity = Menu.class, fetch = FetchType.EAGER)
    public Set<Menu> getMainDishID() {
        return mainDishID;
    }

    public void setMainDishID(Set<Menu> mainDishID) {
        this.mainDishID = mainDishID;
    }

    @ManyToMany(mappedBy = "LunchCombo", targetEntity = Menu.class, fetch = FetchType.EAGER)
    public Set<Menu> getAppetizerDishID() {
        return appetizerDishID;
    }
    public void setAppetizerDishID(Set<Menu> appetizerDishID) {
        this.appetizerDishID = appetizerDishID;
    }

    @ManyToMany(mappedBy = "LunchCombo", targetEntity = Menu.class, fetch = FetchType.EAGER)
    public Set<Menu> getDrinkDishID() {
        return drinkDishID;
    }
    public void setDrinkDishID(Set<Menu> drinkDishID) {
        this.drinkDishID = drinkDishID;
    }

    @ManyToMany(mappedBy = "LunchCombo", targetEntity = Menu.class, fetch = FetchType.EAGER)
    public Set<Menu> getDessertDishID() {
        return dessertDishID;
    }
    public void setDessertDishID(Set<Menu> dessertDishID) {
        this.dessertDishID = dessertDishID;
    }
}
