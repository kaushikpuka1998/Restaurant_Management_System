package com.kgstrivers.Peoples;

import com.kgstrivers.Models.AccountStatus;
import com.kgstrivers.Models.EmployeeCurrentStatus;

import java.util.Date;
import java.util.HashMap;

public class Employee extends Person {

    private String empID;

    private String type;
    private Date datejoined;
    private Account account;

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employee(String name, String mail, String phone) {
        super(name, mail, phone);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    HashMap<String, EmployeeCurrentStatus> allemployee = new HashMap<String, EmployeeCurrentStatus>();
    public void register()
    {
        EmployeeCurrentStatus employeeCurrentStatus = new EmployeeCurrentStatus(empID,name, "ACTIVE",type);
        allemployee.put(empID,employeeCurrentStatus);
        System.out.println("Employee Registered Successfully Emp ID:=>"+empID+" Position:"+type+" Status: "+account.getAccountStatus());
    }

    public HashMap<String, EmployeeCurrentStatus> allemployeelis()
    {
        return allemployee;
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
