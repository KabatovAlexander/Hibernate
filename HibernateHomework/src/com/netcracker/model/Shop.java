package com.netcracker.model;

import lombok.*;
import javax.persistence.*;

@Entity
@Table(name = "shops")
public class Shop {

    @Id
    @SequenceGenerator(name = "shop_seq", sequenceName = "shops_id_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "shop_seq")
    private int id;

    private String name;

    private String location;

    private double commission_fee;

    public Shop( String name, String location, double commission_fee) {
        this.name = name;
        this.location = location;
        this.commission_fee = commission_fee;
    }

    public Shop() {
    }

    @Override
    public String toString() {
        return "\nShop{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", commission_fee=" + commission_fee +
                '}' + "\n";
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public double getCommission_fee() {
        return commission_fee;
    }

    /*@OneToMany(mappedBy = "shops", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Purchase> purchases;*/
}
