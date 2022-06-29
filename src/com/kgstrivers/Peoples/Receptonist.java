package com.kgstrivers.Peoples;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Receptonist extends Employee{
    public Receptonist(String name, String mail, String phone) {
        super(name, mail, phone);
    }
    List<Customer> customerList = new ArrayList<Customer>();
    public void createReservation(Customer customer){
        customerList.add(customer);
        System.out.println("Customer: "+customer.name+" Booking added Successfully on "+customer.date);
    }

    public boolean searchCustomer(String name)
    {
        for(int i=0;i<customerList.size();i++)
        {
            if(customerList.get(i).name == name)
            {
                return true;
            }
        }
        return false;
    }
}
