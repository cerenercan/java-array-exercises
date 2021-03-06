package com.company.challenge.arraylists;

import java.util.ArrayList;

public class MobilePhone {

    private String myNumber;
    private ArrayList<Contact> contacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.contacts = new ArrayList<>();
    }
    public boolean addNewContact(Contact contact){
        if (findContact(contact.getName()) >= 0){
            System.out.println("Contact is already saved.");
            return false;
        }
        contacts.add(contact);
        return true;
    }
    public boolean updateContact(Contact oldContact, Contact newContact){
        int foundPosition = findContact(oldContact);
        if (foundPosition < 0){
            System.out.println(oldContact.getName() + " was not found.");
            return false;
        }
        this.contacts.set(foundPosition, newContact);
        System.out.println(oldContact.getName() + " was replaced with " + newContact.getName() + ".");
        return true;
    }
    public boolean removeContact(Contact contact){
        int foundPosition = findContact(contact);
        if (foundPosition < 0){
            System.out.println(contact.getName() + " was not found.");
            return false;
        }
        this.contacts.remove(foundPosition);
        System.out.println(contact.getName() + " was deleted.");
        return true;
    }
    private int findContact(Contact contact) {
        return this.contacts.indexOf(contact);
    }
    private int findContact(String name){
        for (int i = 0 ; i < this.contacts.size() ; i++){
            Contact contact = this.contacts.get(i);
            if (contact.getName().equals(name)){
                return i;
            }
        }
        return -1;
    }
    public String queryContact(Contact contact){
        if (findContact(contact) >= 0){
            return contact.getName();
        }
        return null;
    }
    public Contact queryContacts(String name){
        int position = findContact(name);
        if (position >= 0){
            return this.contacts.get(position);
        }
        return null;
    }
    public void printContacts(){
        System.out.println("Contact List: ");
        for (int i = 0 ; i < this.contacts.size() ; i++){
            System.out.println(
                    (i + 1)
                    + ". "
                    + this.contacts.get(i).getName()
                    + " -> "
                    + this.contacts.get(i).getPhoneNumber());
        }
    }

}
