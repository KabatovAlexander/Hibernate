package com.netcracker.model;

import javax.persistence.*;

@Entity
@Table(name = "buyers")
public class Buyer {

    @Id
    /*@SequenceGenerator(name = "buyer_seq", sequenceName = "buyers_id_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "buyer_seq")*/
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String last_name;

    private String region;

    private double discount;

    public Buyer( String last_name, String region, double discount) {
        this.last_name = last_name;
        this.region = region;
        this.discount = discount;
    }

    @Override
    public String toString() {
        return "\nBuyer{" +
                "id=" + id +
                ", last_name='" + last_name + '\'' +
                ", region='" + region + '\'' +
                ", discount=" + discount +
                '}' + "\n";
    }

    public Buyer() {
    }

    public int getId() {
        return id;
    }

    public String getLast_name() {
        return last_name;
    }

    public String getRegion() {
        return region;
    }

    public double getDiscount() {
        return discount;
    }

    /*@OneToMany(mappedBy = "buyers", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Purchase> purchases;*/

}
