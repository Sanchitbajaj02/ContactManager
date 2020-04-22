package com.Pratyush;

public class Contact {
    private String name;
    private String number;

    //2 OVERLOADED CONSTRUCTORS -
    public Contact() { //USED ONCE IN MAIN WHILE CREATING OBJECT

    }
    public Contact(String name, String number) { //USED FOR createContact Method
        this.name = name;
        this.number = number;
    }

    //GETTERS -
    public String getName() {
        return name;
    }

    public String getNumber() {
        return number;
    }

    //createContact Method - //Shouldve made this static
    public Contact createContact(String name, String number){
        return new Contact(name, number); //Putting phoneno And Name in OBJECT
    }
}
