package com.netcracker.dao.shop;

import com.netcracker.model.Shop;

import java.util.List;

public interface ShopDAO {

    void add(Shop shop);

    void deleteShopById(int id);

    void update(int id, Shop shop);

    List<Shop> findAllShops();

    int printQtyOfStrings();
}
