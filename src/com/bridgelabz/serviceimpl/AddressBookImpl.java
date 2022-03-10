package com.bridgelabz.serviceimpl;

import com.bridgelabz.model.Contacts;
import com.bridgelabz.service.AddressBook;

import java.util.Scanner;

public class AddressBookImpl implements AddressBook {

    Contacts contact;
    Scanner scanner = new Scanner(System.in);

    /**
     * UseCase2 Adding new Contact to Address Book System
     */
    @Override
    public void add() {
        contact = new Contacts();

        System.out.println("Enter First Name : ");
        String firstName = scanner.nextLine();
        System.out.println("Enter Last Name : ");
        String lastName = scanner.nextLine();
        System.out.println("Enter your Address : ");
        String address = scanner.nextLine();
        System.out.println("Enter your City : ");
        String city = scanner.nextLine();
        System.out.println("Enter your State : ");
        String state = scanner.nextLine();
        System.out.println("Enter Zip Code Of your Area : ");
        long zipCode = scanner.nextLong();
        scanner.nextLine();
        System.out.println("Enter Phone Number : ");
        long phoneNumber = scanner.nextLong();
        scanner.nextLine();
        System.out.println("Enter your Email : ");
        String email = scanner.nextLine();

        contact.setFirstName(firstName);
        contact.setLastName(lastName);
        contact.setAddress(address);
        contact.setCity(city);
        contact.setState(state);
        contact.setZipCode(zipCode);
        contact.setPhoneNumber(phoneNumber);
        contact.setEmail(email);

        System.out.println(" ==================== Details ===================");

        System.out.println(" First Name : " + contact.getFirstName());
        System.out.println(" Last Name : " + contact.getLastName());
        System.out.println(" Address : " + contact.getAddress());
        System.out.println(" City : " + contact.getCity());
        System.out.println(" State : " + contact.getState());
        System.out.println(" Zip Code : " + contact.getZipCode());
        System.out.println(" Phone Number : " + contact.getPhoneNumber());
        System.out.println(" Email : " + contact.getEmail());
    }

    /**
     * UseCase3 Update/Edit Existing Contact Person Using their name
     */
    @Override
    public void editContact() {
        System.out.println("============= Updating Details ================");
        System.out.println("Enter First Name Of Person : ");
        String editName = scanner.nextLine();
        if (editName.equalsIgnoreCase(contact.getFirstName())) {
            add();
        } else {
            System.out.println();
            System.out.println("Invalid Name......!");
            System.out.println("Please enter valid First Name.");
            editContact();
        }
    }
}
