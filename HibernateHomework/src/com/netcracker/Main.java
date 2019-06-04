package com.netcracker;

import com.netcracker.config.SpringConfig;
import com.netcracker.model.Book;
import com.netcracker.model.Buyer;
import com.netcracker.model.Purchase;
import com.netcracker.model.Shop;
import com.netcracker.service.book.BookService;
import com.netcracker.service.buyer.BueyrService;
import com.netcracker.service.purchase.PurchaseService;
import com.netcracker.service.shop.ShopService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import java.util.Date;

public class Main {

    public static void main(String[] args) {

        AbstractApplicationContext context =
                 new AnnotationConfigApplicationContext(SpringConfig.class);

        BookService bookService = (BookService) context.getBean("bookService");
        BueyrService buyerService = (BueyrService) context.getBean("buyerService");
        PurchaseService purchaseService = (PurchaseService) context.getBean("purchaseService");
        ShopService shopService = (ShopService) context.getBean("shopService");

        //testing findAllMethods
        /*System.out.println(bookService.findAllBooks());
        System.out.println(buyerService.findAllBuyers());
        System.out.println(purchaseService.findAllPurchases());
        System.out.println(shopService.findAllShops());*/

        //testing deleteMethods
//        buyerService.deleteBuyerById(3);
//        bookService.deleteBookById(52);
//        shopService.deleteShopById(4);
//        purchaseService.deletePurchaseById(6);

        //testing addMethod
        bookService.add(new Book("War and piece1", 3000, "Book's", 40));
        buyerService.add(new Buyer("Sammy", "Los Andgeles", 15));
        shopService.add(new Shop("WhatBook's", "Angeles", 24));
//        purchaseService.add(new Purchase( new java.sql.Date(2019 - 9 - 15), 6000, 1, 2, 1, 2));

        //testing printQtyOfStringsMethod
//        System.out.println("The quantity of strings in table book is ---> " + bookService.printQtyOfStrings());
//        System.out.println("The quantity of strings in table buyers is ---> " + buyerService.printQtyOfStrings());
//        System.out.println("The quantity of strings in table purchases is ---> " + purchaseService.printQtyOfStrings());
//        System.out.println("The quantity of strings in table shops is---> " + shopService.printQtyOfStrings());

        //testing updateMethod
//        bookService.update(1, new Book("iposaduf", 5030, "wareh1324ous", 101));
//        buyerService.update(1, new Buyer("Bobby", "Los Angeles", 15));
//        purchaseService.update(4, new Purchase(new java.sql.Date(2019 - 9 - 15), 6000, 1, 2, 1, 2));
//        shopService.update(1, new Shop("Hooray", "NY", 26));

        System.out.println(bookService.findAllBooks());
        System.out.println(buyerService.findAllBuyers());
//        System.out.println(purchaseService.findAllPurchases());
        System.out.println(shopService.findAllShops());


    }
}
