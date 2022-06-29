package com.kgstrivers.Peoples;

import com.kgstrivers.Models.ReservationStatus;

import java.util.Date;

public class Customer {
    String name;
    ReservationStatus reservationStatus;
    Date date;

    public Customer(String name, ReservationStatus reservationStatus, Date date) {
        this.name = name;
        this.reservationStatus = reservationStatus;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ReservationStatus getReservationStatus() {
        return reservationStatus;
    }

    public void setReservationStatus(ReservationStatus reservationStatus) {
        this.reservationStatus = reservationStatus;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
