package com.kgstrivers;

import com.kgstrivers.Models.AccountStatus;
import com.kgstrivers.Models.Address;
import com.kgstrivers.Models.ReservationStatus;
import com.kgstrivers.Peoples.*;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

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


        System.out.println("1.Searching the Reservation by Customer Please Enter=>>>> 1");
        System.out.println("2.Creating Reservation Please Enter=>>>>>> 2 ");
        System.out.println("1.Update the Reservation Please Enter=>>>> 3");
        System.out.println("3.Abort Please Enter=>>>>>> 3 ");
        System.out.println("Enter Digit:");
        Scanner sc = new Scanner(System.in);
        Integer value = Integer.valueOf(sc.nextLine());
        while(!value.equals(0)) {

            if(value.equals(1))
            {
                Scanner scv = new Scanner(System.in);
                System.out.println("Customer Name:(Please Click & Enter)");
                String customername = scv.nextLine();
                Customer customerpresent = a.searchCustomer(customername);
                if(customerpresent!= null)
                {
                    System.out.println("Customer name "+customername+" Present in The system & current Status is ===> "+customerpresent.getReservationStatus());
                }
                else
                {
                    System.out.println(customername+"'s Booking Not Present in The system");
                }
                System.out.println("Enter Digit:");
                value = Integer.valueOf(sc.nextLine());
            } else if (value.equals(2)) {
                Scanner scv = new Scanner(System.in);
                System.out.println("Customer Name:");
                String customername = scv.nextLine();
                a.createReservation(customername, new Customer(customername, ReservationStatus.BOOKED,new Date()));
                System.out.println("Enter Digit:");
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
                    System.out.println("Enter Digit:");
                    value = Integer.valueOf(sc.nextLine());
                }
                else  if(inputis.equals(2))
                {
                    Scanner scv = new Scanner(System.in);
                    System.out.println("Customer Name:");
                    String customername = scv.nextLine();
                    a.CheckoutReservation(customername);
                    System.out.println("Enter Digit:");
                    value = Integer.valueOf(sc.nextLine());
                } else{
                    Scanner scv = new Scanner(System.in);
                    System.out.println("Customer Name:");
                    String customername = scv.nextLine();
                    a.CancelledReservation(customername);
                    System.out.println("Enter Digit:");
                    value = Integer.valueOf(sc.nextLine());
                }


            }
        }



    }
}
