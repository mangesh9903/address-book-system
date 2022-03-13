package com.bridgelabz.service;

import com.bridgelabz.model.Contacts;

import java.util.List;

public interface AddressBook {
    List<Contacts> add(Contacts contact);

    void editContact(List<Contacts> contact);

    void deleteContact(List<Contacts> contact);

}
