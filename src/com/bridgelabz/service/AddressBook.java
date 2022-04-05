package com.bridgelabz.service;

import com.bridgelabz.model.Contact;

import java.util.List;

/*********************************************************************
 * Purpose: Interface for Address Book .
 *
 * @author Mangesh Bhujang
 * @version 1.0
 * @since 05-03-2022
 *
 **********************************************************************/

public interface AddressBook {
    List<Contact> add(Contact contact);

    void editContact(List<Contact> contact);

    void deleteContact(List<Contact> contact);

    List<Contact> searchByName(String name);

}
