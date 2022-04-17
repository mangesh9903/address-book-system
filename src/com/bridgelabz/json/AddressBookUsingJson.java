package com.bridgelabz.json;

import com.bridgelabz.model.Contact;
import com.google.gson.Gson;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*********************************************************************
 * Purpose: Class for Write And Read Data From Json File Using Gson Library.
 *
 * @author Mangesh Bhujang
 * @version 1.0
 * @since 07-03-2022
 *
 **********************************************************************/
public class AddressBookUsingJson {
    public static FileWriter fileWriter;

    /**
     * Method :- Method for Write Data in Json File Using Gson Library
     *
     * @param contactList passing contact list as a input.
     */
    public static void writeDataToJson(List<Contact> contactList) {
        Path filePath = Paths.get("Contacts.json");
        Gson gson = new Gson();
        String json = gson.toJson(contactList);
        try {
            fileWriter = new FileWriter(String.valueOf(filePath));
            fileWriter.write(json);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Method :- Method for Read Data From Json File Using Gson Library.
     */
    public static void readDataFromJsonFile() {
        List<Contact> contactList = null;
        Reader reader = null;
        Path filePath = Paths.get("Contacts.json");
        try {
            reader = Files.newBufferedReader(filePath);
            Gson gson = new Gson();
            contactList = new ArrayList<>(Arrays.asList(gson.fromJson(reader, Contact[].class)));
            for (Contact contact : contactList) {
                System.out.println("Firstname : " + contact.getFirstName());
                System.out.println("Lastname : " + contact.getLastName());
                System.out.println("Address : " + contact.getAddress());
                System.out.println("City : " + contact.getCity());
                System.out.println("State : " + contact.getState());
                System.out.println("Zip Code : " + contact.getZipCode());
                System.out.println("Phone number : " + contact.getPhoneNumber());
                System.out.println("Email : " + contact.getEmail());
                System.out.println("---------------------------------------------------");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
