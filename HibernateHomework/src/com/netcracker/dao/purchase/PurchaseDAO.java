package com.netcracker.dao.purchase;

import com.netcracker.model.Purchase;
import java.util.List;

public interface PurchaseDAO {

    void add(Purchase purchase);

    void deletePurchaseById(int id);

    void update(int id, Purchase purchase);

    List<Purchase> findAllPurchases();

    int printQtyOfStrings();
}
