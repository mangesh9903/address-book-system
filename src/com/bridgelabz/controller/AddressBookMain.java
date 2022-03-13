package com.bridgelabz.controller;

import com.bridgelabz.model.Contacts;
import com.bridgelabz.service.AddressBook;
import com.bridgelabz.serviceimpl.AddressBookImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBookMain {

    public static void main(String[] args) {
        System.out.println("Welcome to Address Book Program.");
        AddressBook addressBook = new AddressBookImpl();
        Contacts contact = new Contacts();
        List<Contacts> contactsList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("1. Enter to Add contact.");
                System.out.println("2. Enter to Edit Existing Details.");
                System.out.println("3. Enter to Delete Details.");
                System.out.println("4. Enter to Exit from Address Book Program.");
                int ch = scanner.nextInt();

                switch (ch) {
                    case 1:
                        contactsList = addressBook.add(contact);
                        break;
                    case 2:
                        System.out.println("========================================================== Contact List =======================================================");
                        for (Contacts contacts : contactsList) {
                            System.out.println(contacts);
                        }
                        addressBook.editContact(contactsList);
                        System.out.println("======================================================== Updated Contact List ==================================================");
                        for (Contacts contacts : contactsList) {
                            System.out.println(contacts);
                        }
                        System.out.println();
                        break;
                    case 3:
                        System.out.println("=========================================================== Contact List  ======================================================");
                        for (Contacts contacts : contactsList) {
                            System.out.println(contacts);
                        }
                        addressBook.deleteContact(contactsList);
                        System.out.println("==================================================== After Deletion Contact List ================================================");
                        for (Contacts contacts : contactsList) {
                            System.out.println(contacts);
                        }
                        System.out.println();
                        break;
                    case 4:
                        System.out.println("You are exit from Address Book Program!!!");
                        System.exit(0);
                    default:
                        System.out.println("Invalid Input");
                        break;
                }
            } catch (Exception e) {
                System.out.println("plz Enter Valid Input");
            }
        }

    }
}