package com.company.homeshop;

public class Product {

     private String name;
     private String description;
     double price;

    /**
     * Display a full description of the product
     */
    public void look(){

     }

    /**
     * Add the product to a Bill
     * @param bill the concerned bill
     * @param quantity the quantity to add
     */
     public void buy(Bill bill, int quantity){

     }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
