package com.kgstrivers.Peoples;

import com.kgstrivers.Models.AccountStatus;
import com.kgstrivers.Models.Address;

public class Account {
    private String id;
    private String pass;
    private Address address;
    private AccountStatus accountStatus;

    public Account(String id, String pass, Address address, AccountStatus accountStatus) {
        this.id = id;
        this.pass = pass;
        this.address = address;
        this.accountStatus = accountStatus;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public AccountStatus getAccountStatus() {
        return accountStatus;
    }

    public void setAccountStatus(AccountStatus accountStatus) {
        this.accountStatus = accountStatus;
    }
}
