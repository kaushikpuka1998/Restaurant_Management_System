package com.kgstrivers;

import com.kgstrivers.Models.AccountStatus;
import com.kgstrivers.Models.Address;
import com.kgstrivers.Models.ReservationStatus;
import com.kgstrivers.Peoples.*;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ResaturentSystem {
    public static void main( String[] args)
    {
        System.out.println("Hello");

        Receptonist a = new Receptonist("Kaushik","kgstrivers@gmail.com","8159924565");
        a.setEmpID("45");
        Account fora = new Account("kgstr","12345",new Address("Jalpaiguri","Jalpaiguri","West Bengal","735101","India"), AccountStatus.ACTIVE);
        a.setAccount(fora);

        a.setDatejoined(new Date());
        a.setEmpID("EMP01");

        System.out.println(a.getEmpID() + " Joined on "+ a.getDatejoined());

        a.createReservation(new Customer("Puka", ReservationStatus.BOOKED,new Date()));
        boolean customerpresent = a.searchCustomer("Srila");
        if(customerpresent)
        {
            System.out.println("Customer Present in The system");
        }
        else
        {
            System.out.println("Customer Not Present in The system");
        }

    }
}
