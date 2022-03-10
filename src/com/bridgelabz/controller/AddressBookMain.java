package com.bridgelabz.controller;

import com.bridgelabz.service.AddressBook;
import com.bridgelabz.serviceimpl.AddressBookImpl;

public class AddressBookMain {
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book Program.");
        AddressBook addressBook = new AddressBookImpl();
        addressBook.add();
        addressBook.editContact();
    }
}
