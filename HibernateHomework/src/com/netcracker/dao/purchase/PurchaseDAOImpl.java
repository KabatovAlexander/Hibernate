package com.netcracker.dao.purchase;

import com.netcracker.dao.BaseDAO;
import com.netcracker.model.Purchase;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Projections;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository("purchaseDAO")
@Transactional
public class PurchaseDAOImpl extends BaseDAO implements PurchaseDAO{

    public void add(Purchase purchase) {
        getSession().merge(purchase);
    }

    public void deletePurchaseById(int id) {
        Query query = getSession().createQuery("delete from Purchase where id = :id");
        query.setInteger("id", id);
        query.executeUpdate();
    }

    public void update(int id, Purchase purchase) {
        Query query = getSession().createQuery("update Purchase set dates = :dates, sum = :sum, seller = :seller, buyer = :buyer, book = :book, qty = :qty where id=:id");
        query.setDate("dates", purchase.getDates());
        query.setDouble("sum", purchase.getSum());
        query.setInteger("seller", purchase.getSeller());
        query.setInteger("buyer", purchase.getBuyer());
        query.setInteger("book", purchase.getBook());
        query.setInteger("qty", purchase.getQty());
        query.setInteger("id", id);
        query.executeUpdate();

    }

    public List<Purchase> findAllPurchases() {
        Criteria criteria = getSession().createCriteria(Purchase.class);
        return criteria.list();
    }

    public int printQtyOfStrings() {
        Criteria criteria= getSession().createCriteria(Purchase.class)
                .setProjection(Projections.max("id"));
        return (Integer) criteria.uniqueResult();
    }
}
