package com.bridgelabzuc5;

import java.util.ArrayList;

public class AddressBook {

	ArrayList<Person> addressbook = new ArrayList<Person>();

    /*
    Adding Contacts using addContact method in the arraylist of addressbook
     */
    public ArrayList<Person> addContact(Person person) {
        this.addressbook.add(person);
        return addressbook;

    }

        /*
        Printing method
         */

    public void printAddressBook() {
        for (Person person : this.addressbook) {

            System.out.println("First name = " + person.getFirstName());
            System.out.println("last name = " + person.getLastName());
            System.out.println("address = " + person.getAddress());
            System.out.println("city = " + person.getCity());
            System.out.println("state = " + person.getState());
            System.out.println("zip = " + person.getZip());
            System.out.println("phone number = " + person.getPhoneNumber());
        }
    }

}
