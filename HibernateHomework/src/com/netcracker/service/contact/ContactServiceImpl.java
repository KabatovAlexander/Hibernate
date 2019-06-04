package com.netcracker.service.contact;

import com.netcracker.dao.contact.ContactDAO;
import com.netcracker.model.Contact;
import com.netcracker.service.contact.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("contactService")
public class ContactServiceImpl implements ContactService {

    @Autowired
    private ContactDAO contactDAO;

    public void saveContact(Contact contact) {
       contactDAO.saveContact(contact);
    }

    public List<Contact> findAllContacts() {
       return contactDAO.findAllContacts();
    }

    public Contact findContactById(int id) {
        return contactDAO.findContactById(id);
    }

    public void deleteContactById(int id) {
        contactDAO.deleteContactById(id);
    }
}
