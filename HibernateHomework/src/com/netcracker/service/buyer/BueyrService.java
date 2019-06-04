package com.netcracker.service.buyer;

import com.netcracker.model.Buyer;

import java.util.List;

public interface BueyrService {

    void add(Buyer buyer);

    void deleteBuyerById(int id);

    void update(int id, Buyer buyer);

    List<Buyer> findAllBuyers();

    int printQtyOfStrings();

}
