package com.pluralsight;

public class Product {
    private String Id;
    private String inventory;
    private double price;

    public String getId() {
        return Id;
    }

    public String getInventry() {
        return inventory;
    }

    public double getPrice() {
        return price;
    }

    public String getType() {
        return type;
    }

    public Product(String id, String inventry, double price, String type) {
        Id = id;
        this.inventory = inventry;
        this.price = price;
        this.type = type;
    }

    private String type;
}
