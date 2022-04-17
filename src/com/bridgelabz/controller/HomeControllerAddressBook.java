package com.bridgelabz.controller;

import com.bridgelabz.fileio.AddressBookFileIO;
import com.bridgelabz.json.AddressBookUsingJson;
import com.bridgelabz.model.Contact;
import com.bridgelabz.opencsv.AddressBookOpenCSV;
import com.bridgelabz.service.AddressBook;
import com.bridgelabz.serviceimpl.AddressBookImpl;

import java.util.*;

/*********************************************************************
 * Purpose: Class for Home Controller .
 *
 * @author Mangesh Bhujang
 * @version 1.0
 * @since 05-03-2022
 *
 **********************************************************************/
public class HomeControllerAddressBook {
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book Program.");
        AddressBook addressBook = new AddressBookImpl();
        Contact contact = new Contact();
        List<Contact> contactList = new ArrayList<>();
        AddressBookFileIO bookFileIO = new AddressBookFileIO();
        AddressBookOpenCSV addressBookOpenCSV = new AddressBookOpenCSV();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("1. Enter to Add contact.");
                System.out.println("2. Enter to Edit Existing Details.");
                System.out.println("3. Enter to Delete Details.");
                System.out.println("4. Enter to  Display All Contacts.");
                System.out.println("5. Search Contact Details by Name");
                System.out.println("6. Search Contact Details by City");
                System.out.println("7. Search Contact Details by State");
                System.out.println("8. Write Data in the File Using File IO.");
                System.out.println("9. Read Data From the File Using File IO.");
                System.out.println("10. Write Data in the CSV File Using OpenCSV.");
                System.out.println("11. Read Data From the CSV File Using OpenCSV.");
                System.out.println("12. Write Data in the Json File Using Gson Lib.");
                System.out.println("13. Read Data From the Json File Using Gson Lib.");
                System.out.println("14. Enter to Exit from Address Book Program.");
                int ch = scanner.nextInt();

                switch (ch) {
                    case 1:
                        contactList = addressBook.add(contact);
                        break;
                    case 2:
                        System.out.println("========================================================== Contact List " +
                                "====" +
                                "===================================================");
                        for (Contact contacts : contactList) {
                            System.out.println(contacts);
                        }
                        addressBook.editContact(contactList);
                        System.out.println("======================================================== Updated Contact" +
                                " List ==================================================");
                        for (Contact contacts : contactList) {
                            System.out.println(contacts);
                        }
                        System.out.println();
                        break;
                    case 3:
                        System.out.println("=========================================================== Contact List " +
                                " ======================================================");
                        for (Contact contacts : contactList) {
                            System.out.println(contacts);
                        }
                        addressBook.deleteContact(contactList);
                        System.out.println("==================================================== After Deletion Contact"
                                + " List ================================================");
                        for (Contact contacts : contactList) {
                            System.out.println(contacts);
                        }
                        System.out.println();
                        break;
                    case 4:
                        System.out.println("=========================================================== Contact List " +
                                " ======================================================");
                        for (Contact contacts : contactList) {
                            System.out.println(contacts);
                        }
                        System.out.println("==========================================================================="
                                + "=====================================");
                        break;
                    case 5:
                        System.out.println("Enter First Name:");
                        String name = scanner.next();
                        System.out.println("=========================================================== Contact List " +
                                " ======================================================");
                        contactList = addressBook.searchByName(name);
                        for (Contact contacts : contactList) {
                            System.out.println(contacts);
                        }
                        System.out.println("===========================================================" +
                                "======================================================");
                        break;
                    case 6:
                        System.out.println("Enter City Name:");
                        String cityName = scanner.next();
                        System.out.println("=========================================================== Contact List " +
                                " ======================================================");
                        contactList = addressBook.searchByCity(cityName);
                        for (Contact contacts : contactList) {
                            System.out.println(contacts);
                        }
                        System.out.println("===========================================================" +
                                "======================================================");
                        break;
                    case 7:
                        System.out.println("Enter State Name:");
                        String stateName = scanner.next();
                        System.out.println("=========================================================== Contact List " +
                                " ======================================================");
                        contactList = addressBook.searchByState(stateName);
                        for (Contact contacts : contactList) {
                            System.out.println(contacts);
                        }
                        System.out.println("===========================================================" +
                                "======================================================");
                        break;

                    case 8:
                        System.out.println("======================================================================");
                        System.out.println("Stored Objects In Contact.txt File");
                        System.out.println("======================================================================");
                        bookFileIO.writeData(contactList);
                        break;
                    case 9:
                        contactList = bookFileIO.readData();
                        System.out.println("=================================== Getting Data From Contact.txt File " +
                                " =====================================");
                        for (Contact contacts : contactList) {
                            System.out.println(contacts);
                        }
                        System.out.println("===========================================================" +
                                "======================================================");
                        break;
                    case 10:
                        System.out.println("======================================================================");
                        System.out.println("Stored Data In Contacts.csv File");
                        System.out.println("======================================================================");
                        addressBookOpenCSV.writeDataToCSV(contactList);
                        break;
                    case 11:
                        System.out.println("===================================  " +
                                " =====================================");
                        addressBookOpenCSV.readDataFromCSV();
                        System.out.println("===========================================================" +
                                "======================================================");
                        break;
                    case 12:
                        System.out.println("======================================================================");
                        System.out.println("Stored Data In Contacts File");
                        System.out.println("======================================================================");
                        AddressBookUsingJson.writeDataToJson(contactList);
                        break;
                    case 13:
                        System.out.println("===================================  " +
                                " Getting data From Json File =====================================");
                          AddressBookUsingJson.readDataFromJsonFile();
                        System.out.println("===========================================================" +
                                "======================================================");
                        break;
                    case 14:
                        System.out.println("You are exit from Address Book Program!!!");
                        System.exit(0);
                    default:
                        System.out.println("Invalid Input");
                        break;
                }
            } catch (Exception e) {
                System.out.println("Plz Enter Valid Input");
                e.printStackTrace();
            }
        }

    }
}
