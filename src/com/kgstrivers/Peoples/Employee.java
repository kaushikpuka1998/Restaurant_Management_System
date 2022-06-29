package com.kgstrivers.Peoples;

import java.util.Date;

public class Employee extends Person {

    private String empID;
    private Date datejoined;
    private Account account;

    public Employee(String name, String mail, String phone) {
        super(name, mail, phone);
    }

    public String getEmpID() {
        return empID;
    }

    public void setEmpID(String empID) {
        this.empID = empID;
    }

    public Date getDatejoined() {
        return datejoined;
    }

    public void setDatejoined(Date datejoined) {
        this.datejoined = datejoined;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
}
