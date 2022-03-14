package com.bridgelabz.service;

import com.bridgelabz.model.Contacts;

import java.util.List;
import java.util.Set;

public interface AddressBook {
    Set<Contacts> add(Contacts contact);

    void editContact(Set<Contacts> contact);

    void deleteContact(Set<Contacts> contact);

}
