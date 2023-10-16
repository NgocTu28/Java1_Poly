/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab5.Bai3;

import java.util.Scanner;

/**
 *
 * @author vutu8
 */
public class main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        productManager manager = new productManager();

        do {
            System.out.println("========== Menu ========");
            System.out.println("1.Nhap danh sach san pham tu ban phim.");
            System.out.println("2. Sap xep giam dan theo gia va xuat ra man hinh.");
            System.out.println("3.Tim va xoa san pham theo ten nhap tu ban phim.");
            System.out.println("4.Xuat gia trung binh cua cac san pham.");
            System.out.println("5. Thoat.");

            System.out.println("Nhap lua chon cua ban: ");
            int choose = sc.nextInt();
            
            switch (choose) {
                case 1:
                    manager.addProduct();
                    break;
                case 2:
                    manager.sortProduct();
                    break; 
                case 3:
                    manager.deleteProductByName();
                    break; 
                case 4:
                    manager.avgPriceProduct();
                    break; 
                case 5:
                    System.exit(5);
                    break;    
                default:
                    System.out.println("");
            }
        } while (true);
    }
}
