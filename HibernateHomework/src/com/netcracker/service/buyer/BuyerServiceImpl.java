package com.netcracker.service.buyer;

import com.netcracker.dao.buyer.BuyerDAO;
import com.netcracker.model.Buyer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("buyerService")
public class BuyerServiceImpl implements BueyrService{

    @Autowired
    private BuyerDAO buyerDAO;

    public void add(Buyer buyer){
        buyerDAO.add(buyer);
    }

    public void deleteBuyerById(int id){
        buyerDAO.deleteBuyerById(id);
    }

    public void update(int id, Buyer buyer){
        buyerDAO.update(id, buyer);
    }

    public List<Buyer> findAllBuyers(){
        return buyerDAO.findAllBuyers();
    }

    public int printQtyOfStrings(){
        return buyerDAO.printQtyOfStrings();
    }
}
