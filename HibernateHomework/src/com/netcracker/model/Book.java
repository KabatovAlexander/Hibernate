package com.netcracker.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "books")
public class Book {

    @Id
    @SequenceGenerator(name = "book_seq", sequenceName = "books_id_seq", allocationSize = 2)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "book_seq")
    private int id;

    private String title;

    private double price;

    private String warehouse;

    private int quantity;

    public Book(String title, double price, String warehouse, int quantity) {
        this.title = title;
        this.price = price;
        this.warehouse = warehouse;
        this.quantity = quantity;
    }

    public Book(int id, String title, double price, String warehouse, int quantity) {
        this.id = id;
        this.title = title;
        this.price = price;
        this.warehouse = warehouse;
        this.quantity = quantity;
    }

    public Book() {
    }

    @Override
    public String toString() {
        return "\nBook{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", price=" + price +
                ", warehouse='" + warehouse + '\'' +
                ", quantity=" + quantity +
                '}' + "\n";
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    public String getWarehouse() {
        return warehouse;
    }

    public int getQuantity() {
        return quantity;
    }
/*
    @OneToMany(mappedBy = "book", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Purchase> purchases;*/
}
