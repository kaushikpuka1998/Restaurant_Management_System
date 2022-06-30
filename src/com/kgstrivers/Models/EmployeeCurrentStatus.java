package com.kgstrivers.Models;

public class EmployeeCurrentStatus {
    String id,name,active,designation;

    public EmployeeCurrentStatus(String id, String name, String active, String designation) {
        this.id = id;
        this.name = name;
        this.active = active;
        this.designation = designation;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
    }
}
