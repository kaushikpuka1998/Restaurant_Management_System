package com.kgstrivers.Peoples;

import com.kgstrivers.Models.ReservationStatus;

import java.awt.*;
import java.util.*;
import java.util.List;

public class Receptonist extends Employee{
    public Receptonist(String name, String mail, String phone) {
        super(name, mail, phone);
    }
    HashMap<String ,Customer> customerList = new HashMap<String , Customer>();
    public void createReservation(String name,Customer customer){

        if(customerList.containsKey(name))
        {
            System.out.println("Reservation Already exists!!!");
        }
        else
        {
            customerList.put(name,customer);
            System.out.println("Customer: "+customer.name+"'s Booking added Successfully on "+customer.date);
        }

    }
    public void Checkedineservation(String customer)
    {
        if(customerList.containsKey(customer))
        {
            Customer cust = customerList.get(customer);
            cust.setReservationStatus(ReservationStatus.CHECKEDIN);
            cust.setDate(new Date());
            System.out.println(customer+" Checked In Successfully");
        }
        else
        {
            System.out.println("invalid Resevation!!!");
        }
    }

    public void CancelledReservation(String customer)
    {
        if(customerList.containsKey(customer))
        {
            Customer cust = customerList.get(customer);
            cust.setReservationStatus(ReservationStatus.CANCELLED);
            cust.setDate(new Date());
            System.out.println(customer+" Cancelled In Successfully");
        }
        else
        {
            System.out.println("invalid Resevation!!!");
        }
    }

    public void CheckoutReservation(String customer)
    {
        if(customerList.containsKey(customer))
        {
            Customer cust = customerList.get(customer);
            cust.setReservationStatus(ReservationStatus.CHECKOUT);
            cust.setDate(new Date());
            System.out.println(customer+" CheckedOut Successfully");
        }
        else
        {
            System.out.println("invalid Resevation!!!");
        }
    }

    public Customer searchCustomer(String name)
    {
       if(customerList.containsKey(name))
       {
           return customerList.get(name);
       }
       else
       {
           return null;
       }

    }
}
