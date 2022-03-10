package com.bridgelabz.controller;

import com.bridgelabz.service.AddressBook;
import com.bridgelabz.serviceimpl.AddressBookImpl;

import java.util.Scanner;

public class AddressBookMain {
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book Program.");
        AddressBook addressBook = new AddressBookImpl();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. Enter to Add contact.");
            System.out.println("2. Enter to Edit Existing Details.");
            System.out.println("3. Enter to Delete Details.");
            int ch = scanner.nextInt();

            switch (ch) {
                case 1:
                    addressBook.add();
                    break;
                case 2:
                    addressBook.editContact();
                    break;
                case 3:
                    addressBook.deleteContact();
                    break;
                default:
                    System.out.println("Invalid Input");
                    break;
            }
        }

    }
}