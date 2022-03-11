package com.bridgelabz.service;

import com.bridgelabz.model.Contacts;

public interface AddressBook {
    void add(Contacts contact);
    void editContact();
    void deleteContact();

}
