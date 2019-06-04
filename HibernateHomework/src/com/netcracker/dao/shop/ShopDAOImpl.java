package com.netcracker.dao.shop;

import com.netcracker.dao.BaseDAO;
import com.netcracker.model.Shop;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Projections;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository("shopDAO")
@Transactional
public class ShopDAOImpl extends BaseDAO implements ShopDAO {

    public void add(Shop shop) {
        persist(shop);
    }

    public void deleteShopById(int id) {
        Query query = getSession().createQuery("delete from Shop where id = :id");
        query.setInteger("id",id);
        query.executeUpdate();
    }

    public void update(int id, Shop shop) {
        Query query = getSession().createQuery("update Shop set name = :name, location = :location, commission_fee = :commission_fee where id=:id");
        query.setString("name", shop.getName());
        query.setString("location", shop.getLocation());
        query.setDouble("commission_fee", shop.getCommission_fee());
        query.setInteger("id", id);
        query.executeUpdate();

    }

    public List<Shop> findAllShops() {
        Criteria criteria = getSession().createCriteria(Shop.class);
        return criteria.list();
    }

    public int printQtyOfStrings() {
        Criteria criteria= getSession().createCriteria(Shop.class)
                .setProjection(Projections.max("id"));
        return (Integer) criteria.uniqueResult();
    }
}
