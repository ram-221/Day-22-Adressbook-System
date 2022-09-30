package com.bridgelabzuc5;

import java.util.Scanner;

public class AddressBookMain {

	public static Person input(Scanner scanner) {

		System.out.println("First name");
		String firstName = scanner.next();

		System.out.println("Last name");
		String lastName = scanner.next();

		System.out.println("Address");
		String address = scanner.next();

		System.out.println("City");
		String city = scanner.next();

		System.out.println("State");
		String state = scanner.next();

		System.out.println("Zip Code");
		int zip = scanner.nextInt();

		System.out.println("Mobile Number");
		String phoneNumber = scanner.next();

		Person person = new Person(firstName, lastName, address, city, state, zip, phoneNumber);

		return person;
	}


	public static void main(String[] args) {

		AddressBook addressBook = new AddressBook();
		Scanner scanner = new Scanner(System.in);
		/*
	        Contacts added
		 */
		Person person = new Person("Umesh", "Soddagi", "Sindagi", "Vijayapur", "Karataka", 586202, "8431510221");

		Person person1 = new Person("Ramesh", "Malli", "Almel", "Vijayapur", "Karnataka", 58202, "915488695");

		addressBook.addContact(person);
		addressBook.addContact(person1);
		addressBook.printAddressBook();
		
		
		System.out.println("Enter details of new contacts");
		Person person2 = input(scanner);
		addressBook.addContact(person2);
		/*
	        addContact method used by adding new Contacts	        
		 */

		System.out.println("enter details of new contacts");
		Person person3 = input(scanner);
		addressBook.addContact(person3);

		System.out.println("Multiple Contacts are : ");
		addressBook.printAddressBook();

	}
}
