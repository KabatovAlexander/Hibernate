package com.netcracker.service.contact;

import com.netcracker.model.Contact;

import java.util.List;

public interface ContactService {

    void saveContact(Contact contact);

    List<Contact> findAllContacts();

    Contact findContactById(int id);

    void deleteContactById(int id);


}
