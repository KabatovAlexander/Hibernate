package com.netcracker.service.purchase;

import com.netcracker.dao.purchase.PurchaseDAO;
import com.netcracker.model.Purchase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("purchaseService")
public class PurchaseServiceImpl implements PurchaseService{

    @Autowired
    private PurchaseDAO purchaseDAO;

    public void add(Purchase purchase){
        purchaseDAO.add(purchase);
    }

    public void deletePurchaseById(int id){
        purchaseDAO.deletePurchaseById(id);
    }

    public void update(int id, Purchase purchase){
        purchaseDAO.update(id, purchase);
    }

    public List<Purchase> findAllPurchases(){
        return purchaseDAO.findAllPurchases();
    }

    public int printQtyOfStrings(){
        return purchaseDAO.printQtyOfStrings();
    }
}
