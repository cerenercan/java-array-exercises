package com.company.challenge.autoboxing_unboxing;

public class MainBanking {

    public static void mainSolution(){

        Bank bank = new Bank("Fibabank");

        bank.addBranch("Adelaide");

        bank.addCustomer("Adelaide", "Tim", 50.05);
        bank.addCustomer("Adelaide", "Mark", 175.34);
        bank.addCustomer("Adelaide", "Percy", 220.12);

        bank.addBranch("Sydney");

        bank.addCustomer("Sydney", "Bob", 150.54);

        bank.addCustomerTransaction("Adelaide", "Tim", 44.22);
        bank.addCustomerTransaction("Adelaide", "Tim", 12.44);
        bank.addCustomerTransaction("Adelaide", "Mark", 1.65);

        bank.listCustomers("Adelaide", true);
        System.out.println("*******************************");
        bank.listCustomers("Sydney", true);



    }
}
