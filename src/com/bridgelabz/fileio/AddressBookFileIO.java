package com.bridgelabz.fileio;

import com.bridgelabz.model.Contact;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/*********************************************************************
 * Purpose: Class for Home Controller .
 *
 * @author Mangesh Bhujang
 * @version 1.0
 * @since 06-03-2022
 *
 **********************************************************************/
public class AddressBookFileIO {

    /**
     * Method :- Method for Write Objects In Contacts.txt File
     *
     * @param contactList passing contact list as a input
     * @throws IOException
     */
    public void writeData(List<Contact> contactList) {
        File file = new File("src/com/bridgelabz/fileio/Contacts.txt");
        for (Contact contact : contactList) {
            ObjectOutputStream objectOutputStream = null;
            try {
                objectOutputStream = new ObjectOutputStream(new FileOutputStream(file));
                objectOutputStream.writeObject(contact);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * Method :- Method will return Contacts from Contacts.txt file
     *
     * @return returning Contacts from file
     */
    public List<Contact> readData() {
        File file = new File("src/com/bridgelabz/fileio/Contacts.txt");
        ObjectInputStream objectInputStream = null;
        List<Contact> contactList = new ArrayList<>();
        try {
            objectInputStream = new ObjectInputStream(new FileInputStream(file));
            Contact contact = (Contact) objectInputStream.readObject();
            contactList.add(contact);
            return contactList;
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return contactList;
    }
}
