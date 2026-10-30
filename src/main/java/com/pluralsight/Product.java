package com.pluralsight;

public class Product {
    private String Id;
    private String inventry;
    private double price;

    public String getId() {
        return Id;
    }

    public String getInventry() {
        return inventry;
    }

    public double getPrice() {
        return price;
    }

    public String getType() {
        return type;
    }

    public Product(String id, String inventry, double price, String type) {
        Id = id;
        this.inventry = inventry;
        this.price = price;
        this.type = type;
    }

    private String type;
}
