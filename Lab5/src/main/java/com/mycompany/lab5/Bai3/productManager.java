/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab5.Bai3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author vutu8
 */
public class productManager {

    private ArrayList<product> pd;

    public productManager() {
        pd = new ArrayList<>();
    }

    public void addProduct() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao ten cua san pham: ");
        String name = sc.nextLine();
        System.out.println("Nhap vao gia cua san pham: ");
        Double price = sc.nextDouble();

        pd.add(new product(name, price));
    }

    public void displayProduct() {
        if (pd.size() == 0) {
            System.out.println("Khong co san pham nao.");
        }

        System.out.println("======== Danh sach san pham ===========");
        for (product i : pd) {
            System.out.println("%s  - %.2f (vnd) " + i.getNameProduct() + i.getPrice());
        }
    }

    public void sortProduct() {
        Collections.sort(pd, (o1, o2) -> Double.compare(o1.getPrice(), o2.getPrice()));
        displayProduct();
    }

    public void deleteProductByName() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao ten can tim: ");
        String name = sc.nextLine();

        pd.removeIf((t) -> t.getNameProduct().equals(name));

//        boolean check = false;
//        for (product p : pd) {
//            if (p.getNameProduct().equals(name)) {
//                pd.remove(p);
//                check = true;
//                break;
//            }
//        }
//
//        if (check == true) {
//            System.out.println("Da xoa: %s" + name);
//        } else {
//            System.out.println("Khong tim thay san pham: %s" + name);
//        }
        displayProduct();
    }

    public void avgPriceProduct() {
        if (pd.isEmpty()) {
            System.out.println("Khong co du lieu de tinh.");
        }
        double sum = 0;
        for (product i : pd) {
            sum += i.getPrice();
        }

        double Avg = sum / pd.size();
        System.out.println("Gia trung binh cua san pham: %f (vnd)" + Avg);
    }
}
