package com.example.my_bd_spring.Table;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "Restaurant")
public class Restaurant extends BaseEntity {

    private String address;
    private String phone_number;
    private Set<Administrator> administrator;
    private Set<Chef> chef;
    private Set<Desk> desk;

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

    @OneToMany(mappedBy = "Restaurant",targetEntity =  Administrator.class, fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    public Set<Administrator> getAdministrator() {
        return administrator;
    }
    public void setAdministrator(Set<Administrator> administrator) {
        this.administrator = administrator;
    }

    @OneToMany(mappedBy = "Restaurant",targetEntity = Chef.class, fetch = FetchType.LAZY, cascade = CascadeType.ALL)
//    @JoinTable(
//            name = "Chef_Restaurant",
//            joinColumns = @JoinColumn(name = "chef_id"),
//            inverseJoinColumns = @JoinColumn(name = "restaurant_id")
//    )
    public Set<Chef> getChef() {
        return chef;
    }
    public void setChef(Set<Chef> chef) {
        this.chef = chef;
    }

    @OneToMany(mappedBy = "Restaurant", targetEntity = Desk.class, fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    public Set<Desk> getDesk() {
        return desk;
    }
    public void setDesk(Set<Desk> desk) {
        this.desk = desk;
    }
}


