package com.bridgelabz.serviceimpl;

import com.bridgelabz.model.Contacts;
import com.bridgelabz.service.AddressBook;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class AddressBookImpl implements AddressBook {

    Scanner scanner = new Scanner(System.in);

    List<Contacts> contactsList = new ArrayList<>();

    @Override
    public List<Contacts> add(Contacts contact) {

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

        contactsList.add(new Contacts(firstName, lastName, address, city, state, zipCode, phoneNumber, email));
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
        return contactsList;
    }

    /**
     * UseCase3 Update/Edit Existing Contact Person Using their name
     *
     * @return
     */
    @Override
    public void editContact(List<Contacts> contactsList) {
        System.out.println("============= Updating Details ================");
        System.out.println("Enter First Name Of Person : ");
        Scanner scanner = new Scanner(System.in);
        String editName = scanner.nextLine();
        for (Contacts contact : contactsList) {
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

    /**
     * UseCase4 Deleting Existing Contact Person Using their name
     */
    @Override
    public void deleteContact(List<Contacts> contactsList) {
        System.out.println("============= Deleting Details ================");
        System.out.println("Enter First Name Of Person : ");
        String firstName = scanner.nextLine();
        for (int index = 0; index < contactsList.size(); index++) {
            Contacts contact = contactsList.get(index);
            if (firstName.equals(contact.getFirstName())) {
                contactsList.remove(contact);
            }
        }
    }
}
