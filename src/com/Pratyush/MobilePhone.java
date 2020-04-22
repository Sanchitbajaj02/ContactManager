package com.Pratyush;

import java.util.ArrayList;

public class MobilePhone {
    private ArrayList<Contact> contactArrayList = new ArrayList<Contact>(); //Creating Empty ArrayList of "Contact" type

    public void addContact(Contact newContact) {
        System.out.println("\n");
        //adding this comment
        if (contactArrayList.contains(newContact)) { //Directly Comparing Object(Hence Loop Not Needed)
            System.out.println("Contact Already Exists");
        }
        this.contactArrayList.add(newContact);
        System.out.println("Contact Added Successfully");
    }

    private int indexOfElement(String nameOrNumber) { //WORKS ON EQUALS METHOD //This method is Used in Delete and Modify
        for (int i = 0; i < contactArrayList.size(); i++) {
            if (this.contactArrayList.get(i).getName().toLowerCase().equals(nameOrNumber.toLowerCase()) || this.contactArrayList.get(i).getNumber().equals(nameOrNumber)) {
                return i;
            }
        }
        return -1;
    }

    public void printContacts() {
        System.out.println("\nCONTACTS - ");
        if (contactArrayList.isEmpty()) { //No Contact Condition
            System.out.println("You have no Contacts");
        }
        for (int i = 0; i < contactArrayList.size(); i++) {
            System.out.println((i + 1) + ".\t" + this.contactArrayList.get(i).getName() + "\t:\t" + this.contactArrayList.get(i).getNumber());
        }
//        for (Contact contact : contactArrayList){
//            System.out.println(contact.getName() +"\t" + contact.getNumber());
//        }
    }

    public void searchContact(String searchNameOrNumber) { //WORKS ON CONTAINS METHOD
        System.out.println("\n");
        //Cant Directly Compare Have To run Loop
        for (int i = 0; i < contactArrayList.size(); i++) {
            if (this.contactArrayList.get(i).getName().toLowerCase().contains(searchNameOrNumber.toLowerCase()) || this.contactArrayList.get(i).getNumber().contains(searchNameOrNumber)) {
                System.out.println("Contact Found : ");
                //Print That Contact -
                System.out.println(this.contactArrayList.get(i).getName() + "\t:\t" + this.contactArrayList.get(i).getNumber());
            } else {
                //System.out.println("Contact Not Found");
            }
        }
    }

    public void deleteContact(String nameOrNumber) { //Equals
        System.out.println("\n");
        int indexOfContact = indexOfElement(nameOrNumber); //returns -1 if not found

        if (indexOfContact == -1) {
            System.out.println("Contact Not Found");
        } else {
            this.contactArrayList.remove(indexOfContact);
            System.out.println("Contact Deleted");
        }
    }

    public void modifyContact(String nameOrNumber, Contact newContact) { //Equal Method Used
        System.out.println("\n");
        int indexOfContact = indexOfElement(nameOrNumber);
        if (indexOfContact == -1) {
            System.out.println("Contact Not Found");
        }
//        else {
//            Contact modifiedContact = new Contact(); //Creating Object of Contact
//            modifiedContact.createContact(newName, newNumber); //Passing Values in Created Object
//            contactArrayList.set(indexOfContact,modifiedContact); //Using .set method to do OldObjectAtFoundIndex = new Object
//        }
        else {
            //Implementing if To solve bug of having same contact after modifying
            if (indexOfElement(nameOrNumber) != -1) {
                System.out.println("Similar Contact Exists");
            }
            else {
                contactArrayList.set(indexOfContact, newContact);
            }
        }
    }


}







