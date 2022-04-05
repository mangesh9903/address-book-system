package com.bridgelabz.serviceimpl;

import com.bridgelabz.model.Contact;
import com.bridgelabz.service.AddressBook;

import java.util.*;
import java.util.stream.Collectors;

/*********************************************************************
 * Purpose: Class for Address Book .
 *
 * @author Mangesh Bhujang
 * @version 1.0
 * @since 05-03-2022
 *
 **********************************************************************/
public class AddressBookImpl implements AddressBook {

    Scanner scanner = new Scanner(System.in);

    List<Contact> contactList = new ArrayList<>();

    /**
     * Method : for Adding Contact Details
     *
     * @param contact Passing Contact Object
     * @return returning List Of Contact Objects
     */
    @Override
    public List<Contact> add(Contact contact) {
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

        contactList.add(new Contact(firstName, lastName, address, city, state, zipCode, phoneNumber, email));

        for (Contact contacts : contactList) {
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
        return contactList;
    }

    /**
     * Method : For Updating Contact Details
     *
     * @param contactList Passing Contact List
     */
    @Override
    public void editContact(List<Contact> contactList) {
        System.out.println("============= Updating Details ================");
        System.out.println("Enter First Name Of Person : ");
        Scanner scanner = new Scanner(System.in);
        String editName = scanner.nextLine();
        System.out.println("Please Enter Below Details For Updation");
        for (Contact contact : contactList) {
            if (editName.equals(contact.getFirstName())) {
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
            }
        }

    }

    /**
     * Method : Deleting Contact Details
     *
     * @param contactList Passing Contact list
     */
    @Override
    public void deleteContact(List<Contact> contactList) {
        System.out.println("============= Deleting Details ================");
        System.out.println("Enter First Name Of Person : ");
        String firstName = scanner.nextLine();
        Contact dummycontact = new Contact();
        for (Contact contact : contactList) {
            if (firstName.equals(contact.getFirstName())) {
                dummycontact = contact;
            }
        }
        contactList.remove(dummycontact);
    }

    /**
     * Method : for search contact by name
     *
     * @param name Passing name to be search
     * @return It return searched list of contacts details
     */
    public List<Contact> searchByName(String name) {
        //stream and lambda for find filter given name from arraylist
        return contactList.stream().filter(person -> person.getFirstName().equalsIgnoreCase(name)).collect(Collectors.toList());
    }
}
