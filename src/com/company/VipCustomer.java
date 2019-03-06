package com.company;

public class VipCustomer {

    private String name;
    private double creditLimit;
    private String emailAddress;

    public VipCustomer(String name, double limit, String email) {

        this.name=name;
        this.creditLimit=limit;
        this.emailAddress=email;

    }

    public VipCustomer() {

        this("Cristian", 5000, "cristi@email.com");
        System.out.println("Default account created");
    }

    public VipCustomer(String name, double limit) {

        this(name,limit,"alex@email.com");
        System.out.println("Account created with default e-mail address.");

    }



    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
