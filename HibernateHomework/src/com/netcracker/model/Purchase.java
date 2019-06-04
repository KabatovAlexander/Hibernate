package com.netcracker.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "purchases")
public class Purchase {

    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    @SequenceGenerator(name = "purchase_seq", sequenceName = "purchases_id_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "purchase_seq")
    private int id;

    private Date dates;

    private double sum;

    private int seller;

    private int buyer;

    private int book;

    private int qty;

    public Purchase( Date dates, double sum, int seller, int buyer, int book, int qty) {
        this.dates = dates;
        this.sum = sum;
        this.seller = seller;
        this.buyer = buyer;
        this.book = book;
        this.qty = qty;
    }

    public Purchase() {
    }

    @Override
    public String toString() {
        return "\nPurchase{" +
                "id=" + id +
                ", date=" + dates +
                ", sum=" + sum +
                ", seller=" + seller +
                ", buyer=" + buyer +
                ", book=" + book +
                ", qty=" + qty +
                '}' + "\n";
    }

    public int getId() {
        return id;
    }

    public Date getDates() {
        return dates;
    }

    public double getSum() {
        return sum;
    }

    public int getSeller() {
        return seller;
    }

    public int getBuyer() {
        return buyer;
    }

    public int getBook() {
        return book;
    }

    public int getQty() {
        return qty;
    }

    /*@ManyToOne(targetEntity = Book.class, fetch = FetchType.LAZY)
    @JoinColumn(name = "book_id", referencedColumnName = "id")
    private Book book;

    @ManyToOne(targetEntity = Buyer.class, fetch = FetchType.LAZY)
    @JoinColumn(name = "buyer_id", referencedColumnName = "id")
    private Buyer buyers;

    @ManyToOne(targetEntity = Shop.class, fetch = FetchType.LAZY)
    @JoinColumn(name = "shop_id", referencedColumnName = "id")
    private Shop shops;*/


}
