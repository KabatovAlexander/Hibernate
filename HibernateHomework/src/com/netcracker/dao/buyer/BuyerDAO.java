package com.netcracker.dao.buyer;

import com.netcracker.model.Buyer;

import java.util.List;

public interface BuyerDAO {

    void add(Buyer buyer);

    void deleteBuyerById(int id);

    void update(int id, Buyer buyer);

    List<Buyer> findAllBuyers();

    int printQtyOfStrings();
}
