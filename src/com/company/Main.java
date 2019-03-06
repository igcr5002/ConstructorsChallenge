package com.company;

public class Main {

    public static void main(String[] args) {

        VipCustomer cristisAccount = new VipCustomer();
        VipCustomer alexAccount = new VipCustomer("Alex", 100000);
        VipCustomer gabisAccount = new VipCustomer("Gabi",3000,"gabi@email.com");

        System.out.println(cristisAccount.getCreditLimit());
        System.out.println(cristisAccount.getEmailAddress());
        System.out.println(cristisAccount.getName());

        System.out.println(alexAccount.getName());
        System.out.println(alexAccount.getEmailAddress());
        System.out.println(alexAccount.getCreditLimit());

        System.out.println(gabisAccount.getCreditLimit());
        System.out.println(gabisAccount.getEmailAddress());
        System.out.println(gabisAccount.getName());

    }
}
