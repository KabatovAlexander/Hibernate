package com.netcracker.service.shop;

import com.netcracker.dao.shop.ShopDAO;
import com.netcracker.model.Shop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("shopService")
public class ShopServiceImpl implements ShopService {

    @Autowired
    private ShopDAO shopDAO;

    public void add(Shop shop){
        shopDAO.add(shop);
    }

    public void deleteShopById(int id){
        shopDAO.deleteShopById(id);
    }

    public void update(int id, Shop shop){
        shopDAO.update(id, shop);
    }

    public List<Shop> findAllShops(){
        return shopDAO.findAllShops();
    }

    public int printQtyOfStrings(){
        return shopDAO.printQtyOfStrings();
    }
}
