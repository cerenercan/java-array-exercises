package com.company.challenge.arraylists;

import java.util.Scanner;

public class MainClass {

    private static final Scanner scanner = new Scanner(System.in);
    private static final MobilePhone mobilePhone = new MobilePhone("0039 330 4404");

    public static void mainMethod(){
        boolean quit = false;
        startPhone();
        printActions();
        while (!quit){
            System.out.println("Enter action: (6 to show available actions)");
            int action = scanner.nextInt();
            scanner.nextLine();
            switch (action){
                case 0:
                    System.out.println("Shutting down");
                    quit = true;
                    break;
                case 1:
                    mobilePhone.printContacts();
                    break;
                case 2:
                    addNewContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    queryContact();
                    break;
                case 6:
                    printActions();
                    break;
            }

        }
    }
    private static void startPhone(){
        System.out.println("Phone starting...");
    }
    private static void printActions(){
        System.out.println("\nAvailable actions:\nPress");
        System.out.println("0 - To shutdown");
        System.out.println("1 - To print contacts");
        System.out.println("2 - To add a new contact");
        System.out.println("3 - To update existing contact");
        System.out.println("4 - To remove an existing contact");
        System.out.println("5 - To query an existing contact");
        System.out.println("6 - Print list for available actions");
        System.out.println("Choose your action: ");
    }
    private static void addNewContact(){
        System.out.println("Enter new contact name: ");
        String name = scanner.nextLine();
        System.out.println("Enter new phone number: ");
        String phoneNumber = scanner.nextLine();
        Contact newContact = new Contact(name, phoneNumber);
        if (mobilePhone.addNewContact(newContact)){
            System.out.println("New contact added.");
        } else {
            System.out.println("Cannot add, " + name + " already on file.");
        }
    }
    private static void updateContact(){
        System.out.println("Enter existing contact name: ");
        String name = scanner.nextLine();
        Contact existingContactRecord = mobilePhone.queryContacts(name);
        if (existingContactRecord == null){
            System.out.println("Contact not found");
        }
        System.out.println("Enter new contact name: ");
        String newName = scanner.nextLine();
        System.out.println("Enter new contact number: ");
        String newNumber = scanner.nextLine();
        Contact newContact = new Contact(newName, newNumber);
        if (mobilePhone.updateContact(existingContactRecord, newContact)) {
            System.out.println("Record updated");
        } else {
            System.out.println("Error updating contact");
        }
    }
    private static void removeContact(){
        System.out.println("Enter existing contact name: ");
        String name = scanner.nextLine();
        Contact existingContactRecord = mobilePhone.queryContacts(name);
        if (existingContactRecord == null){
            System.out.println("Contact not found");
        }
        if (mobilePhone.removeContact(existingContactRecord)){
            System.out.println("Contact deleted");
        } else {
            System.out.println("Error deleting contact");
        }
    }
    private static void queryContact(){
        System.out.println("Enter existing contact name: ");
        String name = scanner.nextLine();
        Contact existingContactRecord = mobilePhone.queryContacts(name);
        if (existingContactRecord == null){
            System.out.println("Contact not found");
            return;
        }
        System.out.println(
                "Name: " + existingContactRecord.getName() +
                "phone number is: " + existingContactRecord.getPhoneNumber()
        );
    }
}
