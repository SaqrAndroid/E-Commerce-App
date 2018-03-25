package com.example.dell.logindemo;

/**
 * Created by dell on 19/03/2018.
 */

public class Item {
    public String name;
    public String category;
    public String price;
    //private String color;
    public int quantity;
    public int size;
    public int image;

    public Item() {
    }

    public Item(String name, String category, String price, int quantity, int size, int image) {
        this.name = name;
        this.category = category;
        this.price = price;
        //this.color = color;
        this.quantity = quantity;
        this.size = size;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public String getPrice() {
        return price;
    }

    /*public String getColor() {
        return color;
    }*/

    public int getQuantity() {
        return quantity;
    }

    public int getSize() {
        return size;
    }

    public int getImage() {
        return image;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    /*public void setColor(String color) {
        this.color = color;
    }*/

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setImage(int image) {
        this.image = image;
    }
}