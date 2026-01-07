package com.hijabshop.entities;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;

@Entity  // NEW: Tells Java this class maps to a database table
@Table(name = "HIJAB_PRODUCT") // NEW: Specifies the table name
public class HijabProduct implements Serializable {

    @Id // NEW: Tells Java this is the Primary Key
    @Column(name = "SKU") // NEW: Maps to the "SKU" column in DB
    private String sku;

    @Column(name = "PRICE") // NEW: Maps to the "PRICE" column
    private double price;

    public HijabProduct() {
    }

    public HijabProduct(String sku, double price) {
        this.sku = sku;
        this.price = price;
    }

    // Getters and Setters
    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
