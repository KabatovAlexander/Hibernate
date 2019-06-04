package com.netcracker.dao.books;

import com.netcracker.dao.BaseDAO;
import com.netcracker.model.Book;
import org.hibernate.*;
import org.hibernate.criterion.Projections;
import org.springframework.stereotype.Repository;
import javax.transaction.Transactional;
import java.util.List;

@Repository("bookDAO")
@Transactional()
public class BookDAOImpl extends BaseDAO implements BookDao {

    public void add(Book book) {
        persist(book);
        /*Session session = null;
        try{
            session = getSession().getSessionFactory().openSession();
            session.beginTransaction();
            session.save(book);
            session.getTransaction().commit();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            if(session != null && session.isOpen())
                session.close();
        }*/
    }


    public void deleteBookById(int id) {
        Query query = getSession().createQuery("delete from Book where id = :id");
        query.setInteger("id",id);
        query.executeUpdate();

    }

    public void update(int id, Book book) {
        Query query = getSession().createQuery("update Book set title = :title, price = :price, warehouse = :warehouse, quantity = :quantity where id=:id");
        query.setString("title", book.getTitle());
        query.setDouble("price", book.getPrice());
        query.setString("warehouse", book.getWarehouse());
        query.setInteger("quantity", book.getQuantity());
        query.setInteger("id", id);
        query.executeUpdate();
    }

    public List<Book> findAllBooks() {
        Criteria criteria = getSession().createCriteria(Book.class);
        return criteria.list();
    }

    public int printQtyOfStrings() {

        Criteria criteria= getSession().createCriteria(Book.class)
                .setProjection(Projections.max("id"));
        return (Integer) criteria.uniqueResult();

    }
}
