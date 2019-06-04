package com.netcracker.dao.buyer;

import com.netcracker.dao.BaseDAO;
import com.netcracker.model.Buyer;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Projections;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository("buyerDAO")
@Transactional
public class BuyerDAOImpl extends BaseDAO implements BuyerDAO {

    public void add(Buyer buyer) {
        persist(buyer);
    }

    public void deleteBuyerById(int id) {
        Query query = getSession().createQuery("delete from Buyer where id = :id");
        query.setInteger("id",id);
        query.executeUpdate();
    }

    public void update(int id, Buyer buyer) {
        Query query = getSession().createQuery("update Buyer set last_name = :last_name, region = :region, discount = :discount where id=:id");
        query.setString("last_name", buyer.getLast_name());
        query.setString("region", buyer.getRegion());
        query.setDouble("discount", buyer.getDiscount());
        query.setInteger("id", id);
        query.executeUpdate();

    }

    public List<Buyer> findAllBuyers() {
        Criteria criteria = getSession().createCriteria(Buyer.class);
        return criteria.list();
    }

    public int printQtyOfStrings() {
        Criteria criteria= getSession().createCriteria(Buyer.class)
                .setProjection(Projections.max("id"));
        return (Integer) criteria.uniqueResult();
    }
}
