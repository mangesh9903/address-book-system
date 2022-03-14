package com.bridgelabz.serviceimpl;

import com.bridgelabz.model.Contacts;
import com.bridgelabz.service.AddressBook;

import java.util.*;

public class AddressBookImpl implements AddressBook {

    Scanner scanner = new Scanner(System.in);

    Set<Contacts> contactsSet = new HashSet<>();

    @Override
    public Set<Contacts> add(Contacts contact) {
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

        contactsSet.add(new Contacts(firstName, lastName, address, city, state, zipCode, phoneNumber, email));

        for (Contacts contacts : contactsSet) {
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
        return contactsSet;
    }


    @Override
    public void editContact(Set<Contacts> contactsSet) {
        System.out.println("============= Updating Details ================");
        System.out.println("Enter First Name Of Person : ");
        Scanner scanner = new Scanner(System.in);
        String editName = scanner.nextLine();
        for (Contacts contact : contactsSet) {
            if (editName.equals(contact.getFirstName())) {
                System.out.println("Enter First Name List : ");
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
            }
        }

    }


    @Override
    public void deleteContact(Set<Contacts> contactsSet) {
        System.out.println("============= Deleting Details ================");
        System.out.println("Enter First Name Of Person : ");
        String firstName = scanner.nextLine();
        for (Contacts contact : contactsSet) {
            if (firstName.equals(contact.getFirstName())) {
                contactsSet.remove(contact);
            }
        }
    }
}
