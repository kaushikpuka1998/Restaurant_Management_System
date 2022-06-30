package com.kgstrivers;

import com.kgstrivers.Models.*;
import com.kgstrivers.Peoples.*;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Scanner;

public class ResaturentSystem {
    public static void main( String[] args)
    {
        System.out.println("Please Login");

        Receptonist a = new Receptonist("Kaushik","kgstrivers@gmail.com","8159924565");


        Account fora = new Account("kgstr","12345",new Address("Jalpaiguri","Jalpaiguri","West Bengal","735101","India"), AccountStatus.ACTIVE);
        a.setAccount(fora);
        a.setType("Receptonist");
        a.setDatejoined(new Date());
        a.setName("Kaushik");
        a.setEmpID("REC45");
        a.register();
        System.out.println(a.getEmpID() + " Joined on "+ a.getDatejoined());

        Waiter wt = new Waiter("Kaushik Waiter","kgstriveredtgtrs@gmail.com", "8451729632");
        Account forwaiter = new Account("wait2","123456",new Address("JPG","JPG","west bengal","748596","India"),AccountStatus.ACTIVE);
        wt.setAccount(forwaiter);
        wt.setType("Waiter");
        wt.setName("Kaushik walter");
        wt.setDatejoined(new Date());
        wt.setEmpID("WAIT955");

        wt.register();

        HashMap<String, EmployeeCurrentStatus> allemployee = wt.allemployeelis();
        allemployee.forEach((key,value)->{
            System.out.println("Name: "+value.getName()+" ,Status: "+value.getActive()+" Designation: "+value.getDesignation());
        });
        System.out.println("1.Searching the Reservation by Customer Please Enter=>>>> 1");
        System.out.println("2.Creating Reservation Please Enter=>>>>>> 2");
        System.out.println("3.Update the Reservation Please Enter=>>>> 3");
        System.out.println("4.Abort Please Enter=>>>>>> 0");
        System.out.println("Enter Process number:");
        Scanner sc = new Scanner(System.in);
        Integer value = Integer.valueOf(sc.nextLine());
        while(!value.equals(0)) {

            if(value.equals(1))
            {
                Scanner scv = new Scanner(System.in);
                System.out.println("Customer Name:(Please Click & Enter)");
                String customername = scv.nextLine();
                Customer customerpresent = a.searchCustomer(customername);
                if(customerpresent.getReservationStatus().equals(ReservationStatus.CANCELLED)){
                    System.out.println(customername+"'s Booking is Cancelled in The system On "+customerpresent.getDate());
                }
                else if(!customerpresent.getReservationStatus().equals(ReservationStatus.CHECKOUT) )
                {
                    System.out.println("Customer name "+customername+" Present in The system & current Status is ===> "+customerpresent.getReservationStatus());
                }
                else
                {
                    System.out.println(customername+"'s Booking is Not Active in The system");
                }
                System.out.println("Enter Process number:");
                value = Integer.valueOf(sc.nextLine());
            } else if (value.equals(2)) {
                Scanner scv = new Scanner(System.in);
                System.out.println("Customer Name:");
                String customername = scv.nextLine();
                a.createReservation(customername, new Customer(customername, ReservationStatus.BOOKED,new Date()));
                System.out.println("Enter Process number:");
                value = Integer.valueOf(sc.nextLine());
            }
            else if (value.equals(3)) {

                Scanner takinwhichwork = new Scanner(System.in);
                System.out.println("For Check-In      =>1");
                System.out.println("For Check-OUT     =>2");
                System.out.println("For Cancellation  =>3");
                System.out.println("Enter Number ");
                Integer inputis = takinwhichwork.nextInt();
                if(inputis.equals(1))
                {
                    Scanner scv = new Scanner(System.in);
                    System.out.println("Customer Name:");
                    String customername = scv.nextLine();
                    a.Checkedineservation(customername);
                    System.out.println("Enter Process number:");
                    value = Integer.valueOf(sc.nextLine());
                }
                else  if(inputis.equals(2))
                {
                    Scanner scv = new Scanner(System.in);
                    System.out.println("Customer Name:");
                    String customername = scv.nextLine();
                    a.CheckoutReservation(customername);
                    System.out.println("Enter Process number:");
                    value = Integer.valueOf(sc.nextLine());
                } else{
                    Scanner scv = new Scanner(System.in);
                    System.out.println("Customer Name:");
                    String customername = scv.nextLine();
                    a.CancelledReservation(customername);
                    System.out.println("Enter Process number:");
                    value = Integer.valueOf(sc.nextLine());
                }


            }
        }



    }
}
