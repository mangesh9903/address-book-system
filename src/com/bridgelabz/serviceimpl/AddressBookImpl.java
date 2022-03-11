package com.bridgelabz.serviceimpl;

import com.bridgelabz.model.Contacts;
import com.bridgelabz.service.AddressBook;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBookImpl implements AddressBook {

    Contacts contact;
    Scanner scanner = new Scanner(System.in);

    List<Contacts> contactsList = new ArrayList<>();

    @Override
    public void add(Contacts contact) {
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


        contactsList.add(contact);
        for (Contacts contacts : contactsList) {
            System.out.println(" ==================== Details ===================");

            System.out.println(" First Name : " + contacts.getFirstName());
            System.out.println(" Last Name : " + contacts.getLastName());
            System.out.println(" Address : " + contacts.getAddress());
            System.out.println(" City : " + contacts.getCity());
            System.out.println(" State : " + contacts.getState());
            System.out.println(" Zip Code : " + contacts.getZipCode());
            System.out.println(" Phone Number : " + contacts.getPhoneNumber());
            System.out.println(" Email : " + contacts.getEmail());
        }
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
            add(contact);
        } else {
            System.out.println();
            System.out.println("Invalid Name......!");
            System.out.println("Please enter valid First Name.");
            editContact();
        }
    }

    /**
     * UseCase4 Deleting Existing Contact Person Using their name
     */
    @Override
    public void deleteContact() {
        System.out.println("============= Deleting Details ================");
        System.out.println("Enter First Name Of Person : ");
        String firstName = scanner.nextLine();
        if (firstName.equals(contact.getFirstName())) {
            System.out.println("You are deleted : " + contact.getFirstName());
            contact = null;
        } else {
            System.out.println();
            System.out.println("Invalid Name......!");
            System.out.println("Please enter valid First Name.");
            deleteContact();

        }
    }
}
