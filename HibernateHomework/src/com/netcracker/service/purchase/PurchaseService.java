package com.netcracker.service.purchase;

import com.netcracker.model.Purchase;

import java.util.List;

public interface PurchaseService {

    void add(Purchase purchase);

    void deletePurchaseById(int id);

    void update(int id, Purchase purchase);

    List<Purchase> findAllPurchases();

    int printQtyOfStrings();

}
