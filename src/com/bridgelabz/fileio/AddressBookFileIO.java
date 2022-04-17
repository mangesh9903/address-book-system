package com.bridgelabz.fileio;

import com.bridgelabz.model.Contact;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/*********************************************************************
 * Purpose: Class for Read And Write Data Using File IO.
 *
 * @author Mangesh Bhujang
 * @version 1.0
 * @since 06-03-2022
 *
 **********************************************************************/
public class AddressBookFileIO {

    List<Contact> contactList = new ArrayList<>();

    /**
     * Method :- Method for Write Objects In File Using File IO
     *
     * @param contactList passing contact list as a input
     * @throws IOException
     */
    public void writeData(List<Contact> contactList) {
        File file = new File("src/com/bridgelabz/fileio/Contact.txt");
        ObjectOutputStream objectOutputStream = null;

        try {
            objectOutputStream = new ObjectOutputStream(new FileOutputStream(file));
            objectOutputStream.writeObject(contactList);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                objectOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * Method :- Method will return Contacts from Contact.txt file Using File IO
     *
     * @return returning Contacts from file
     */
    public List<Contact> readData() {
        File file = new File("src/com/bridgelabz/fileio/Contact.txt");
        ObjectInputStream objectInputStream = null;
        try {
            objectInputStream = new ObjectInputStream(new FileInputStream(file));
            contactList = (List<Contact>) objectInputStream.readObject();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                objectInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return contactList;
    }
}
