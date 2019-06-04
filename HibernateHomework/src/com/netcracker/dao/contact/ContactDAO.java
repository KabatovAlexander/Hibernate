package com.netcracker.dao.contact;

import com.netcracker.model.Contact;

import java.util.List;

public interface ContactDAO {

    void saveContact(Contact contact);

    List<Contact> findAllContacts();

    Contact findContactById (int id);

    void deleteContactById (int id);

}
