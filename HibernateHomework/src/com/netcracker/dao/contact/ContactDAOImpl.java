package com.netcracker.dao.contact;

import com.netcracker.dao.BaseDAO;
import com.netcracker.dao.contact.ContactDAO;
import com.netcracker.model.Contact;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository("contactDAO")
@Transactional
public class ContactDAOImpl extends BaseDAO implements ContactDAO {


    public void saveContact(Contact contact) {
        persist(contact);
    }

    public List<Contact> findAllContacts() {
        Criteria criteria = getSession().createCriteria(Contact.class);
        return criteria.list();
    }

    public Contact findContactById(int id) {
        Criteria criteria = getSession().createCriteria(Contact.class);
        criteria.add(Restrictions.eq("id", id));
        return (Contact) criteria.uniqueResult();
    }

    public void deleteContactById(int id) {

        Query query = getSession().createQuery("delete from Contact where id = :id");
        query.setInteger("id",id);
        query.executeUpdate();
    }
}
