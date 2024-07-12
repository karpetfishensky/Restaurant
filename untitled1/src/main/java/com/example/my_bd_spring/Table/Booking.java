package com.example.my_bd_spring.Table;

import jakarta.persistence.*;
import jakarta.persistence.criteria.CriteriaBuilder;

import java.time.LocalDate;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "Booking")
public class Booking extends BaseEntity {

    private Date bookingDate;
    private Integer countOfVisitors;
    private String visitorName;
    private String visitorPhoneNumber;
    private Set<Desk> deskID;

    public Booking(Date bookingDate, Integer countOfVisitors, String visitorName, String visitorPhoneNumber) {
        this.bookingDate = bookingDate;
        this.countOfVisitors = countOfVisitors;
        this.visitorName = visitorName;
        this.visitorPhoneNumber = visitorPhoneNumber;
    }

    @Column(name = "booking_date")
    public Date getBookingDate() {
        return bookingDate;
    }
    public void setBookingDate(Date bookingDate) {
        this.bookingDate = bookingDate;
    }

    @Column(name = "visitor_name")
    public String getVisitorName() {
        return visitorName;
    }
    public void setVisitorName(String visitorName) {
        this.visitorName = visitorName;
    }

    @Column(name = "visitor_phone_number")
    public String getVisitorPhoneNumber() {
        return visitorPhoneNumber;
    }
    public void setVisitorPhoneNumber(String visitorPhoneNumber) {
        this.visitorPhoneNumber = visitorPhoneNumber;
    }

    @Column(name = "count_of_visitors")
    public Integer getCountOfVisitors() {
        return countOfVisitors;
    }
    public void setCountOfVisitors(Integer countOfVisitors) {
        this.countOfVisitors = countOfVisitors;
    }

    @ManyToMany(mappedBy = "Booking")
    public Set<Desk> getDeskID() {
        return deskID;
    }
    public void setDeskID(Set<Desk> deskID) {
        this.deskID = deskID;
    }
}
