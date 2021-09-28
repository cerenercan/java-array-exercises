package com.company.linked_lists;

import java.util.ArrayList;

public class LinkedListMainClass {

    public static void linkedList(){
        Customer customer = new Customer("Tim", 54.96);
        Customer customer1 = customer;
        customer1.setBalance(12.18);

        System.out.println("Balance for customer " + customer.getName() + " is " + customer.getBalance());

        ArrayList<Integer> integerArrayList = new ArrayList<>();
        integerArrayList.add(1);
        integerArrayList.add(3);
        integerArrayList.add(4);

        for (int i = 0 ; i < integerArrayList.size() ; i++){
            System.out.println(i + ": " + integerArrayList.get(i));

        }
        integerArrayList.add(1, 2);
        System.out.println("After the update: ");
        for (int i = 0 ; i < integerArrayList.size() ; i++){
            System.out.println(i + ": " + integerArrayList.get(i));

        }

    }
}
