package com.Pratyush;

import java.util.Scanner;

public class Main {
    // Create a program that implements a simple mobile phone with the following capabilities.
    // Able to store, modify, remove and query contact names.
    // You will want to create a separate class for Contacts (name and phone number).
    // Create a master class (MobilePhone) that holds the ArrayList of Contacts
    // The MobilePhone class has the functionality listed above.
    // Add a menu of options that are available.
    // Options:  Quit, print list of contacts, add new contact, update existing contact, remove contact
    // and search/find contact.
    // When adding or updating be sure to check if the contact already exists (use name)
    // Be sure not to expose the inner workings of the Arraylist to MobilePhone
    // e.g. no ints, no .get(i) etc
    // MobilePhone should do everything with Contact objects only.

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        //Creating Objects -
        Contact contact = new Contact();
        MobilePhone mobilePhone = new MobilePhone();

        int choice = 0;
        printInstructions();
        while (choice != 6){
            System.out.println("\nEnter Your Choice (0 For Command List) : ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case 0: printInstructions();
                        break;
                case 1:
                    mobilePhone.printContacts();
                    break;
                case 2:
                    System.out.println("Enter Name : ");
                    String name = scanner.next();
                    System.out.println("Enter Number : ");
                    String number = scanner.next();
                    mobilePhone.addContact(contact.createContact(name,number));
                    break;
                case 3:
                    System.out.println("Enter Name/Number of Contact to be searched : ");
                    String nameOrNumber = scanner.next();
                    mobilePhone.searchContact(nameOrNumber);
                    break;
                case 4:
                    System.out.println("Enter Name/Number of Contact to be deleted : ");
                    nameOrNumber = scanner.next();
                    mobilePhone.deleteContact(nameOrNumber);
                    break;
                case 5:
                    System.out.println("Enter Name/Number of Contact to be modified : ");
                    nameOrNumber = scanner.next();

                    System.out.println("Enter new Name : ");
                    String newName = scanner.next();
                    System.out.println("Enter new Number : ");
                    String newNumber = scanner.next();
                    mobilePhone.modifyContact(nameOrNumber,contact.createContact(newName,newNumber));
                    break;
                case 6:
                    System.out.println("Exiting Application");
                    System.exit(0);
                default:
                    System.out.println("Invalid Input");
                    printInstructions();
                    break;
            }
        }

    }

    private static void printInstructions(){
        System.out.println("\nWELCOME TO CONTACTS MANAGER \n");
        System.out.println("1 - Print Contacts");
        System.out.println("2 - Add Contact");
        System.out.println("3 - Search Contact");
        System.out.println("4 - Delete Contact");
        System.out.println("5 - Modify Contact");
        System.out.println("6 - Exit Application");
    }

}
