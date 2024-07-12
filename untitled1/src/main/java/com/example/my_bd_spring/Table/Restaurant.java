package com.example.my_bd_spring.Table;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "Restaurant")
public class Restaurant extends BaseEntity {

    private String address;
    private String phone_number;
    private Administrator administrator;
    private Chef chef;
    private Desk desk;

    public Restaurant(String address, String phone_number) {
        this.address = address;
        this.phone_number = phone_number;
    }

    @Column(name = "address")
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Column(name = "phone_number")
    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    @OneToMany(mappedBy = "Restaurant", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    public Administrator getAdministrator() {
        return administrator;
    }
    public void setAdministrator(Administrator administrator) {
        this.administrator = administrator;
    }

    @OneToMany(mappedBy = "Restaurant", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    public Chef getChef() {
        return chef;
    }
    public void setChef(Chef chef) {
        this.chef = chef;
    }

    @OneToMany(mappedBy = "Restaurant", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    public Desk getDesk() {
        return desk;
    }
    public void setDesk(Desk desk) {
        this.desk = desk;
    }
}


