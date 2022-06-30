package com.kgstrivers.Peoples;

public abstract class Person {
    private String name;
    private String mail;
    private String phone;

    public Person(String name, String mail, String phone) {
        this.name = name;
        this.mail = mail;
        this.phone = phone;
    }

    public abstract  void register();


}
