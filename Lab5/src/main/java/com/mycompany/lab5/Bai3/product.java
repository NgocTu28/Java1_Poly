/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab5.Bai3;

/**
 *
 * @author vutu8
 */
public class product {
    private String nameProduct;
    private double price;

    public product() {
    }

    public product(String nameProduct, double price) {
        this.nameProduct = nameProduct;
        this.price = price;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    public int compareTo(product o) {
        if (this.price < o.price) {
            return -1;
        } else if (this.price == o.price) {
            return 0;
        } else {
            return 1;
        }
    }
    
    @Override
    public String toString() {
        return "Tên sản phẩm: " + nameProduct + ", Giá: " + price;
    }
}
