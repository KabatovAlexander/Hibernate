package com.netcracker.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository ("baseDAO")
public class BaseDAO {

    @Autowired
    SessionFactory sessionFactory;

    protected Session getSession(){
        return sessionFactory.getCurrentSession();
    }

    protected void persist(Object object){
        getSession().persist(object);
    }

    protected void delete(Object object){
        getSession().delete(object);
    }
}
