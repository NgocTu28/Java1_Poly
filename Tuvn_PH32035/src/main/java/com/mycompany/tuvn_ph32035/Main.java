/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tuvn_ph32035;

import java.util.Scanner;

/**
 *
 * @author vutu8
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QLTV tv = new QLTV();
        int choose;
        do {
            System.out.println("======================= MENU =========================");
            System.out.println("0. Thoat");
            System.out.println("1.Nhap danh sach doi tuong.");
            System.out.println("2.Xuat danh sach doi tuong.");
            System.out.println("3.Sap xep danh sach doi tuong giam dan theo tuoi tho.");
            System.out.println("4. Tim doi tuong theo khoang tuoi tho. ");
            System.out.println("5. Kế Thừa.");
            System.out.println("Nhap vao lua chon cua ban: ");
            choose = sc.nextInt();

            switch (choose) {
                case 0:
                    System.out.println("Tam biet.");
                    break;
                case 1:
                    tv.bai1(sc);
                    break;
                case 2:
                    tv.bai2();
                    break;
                case 3:
                    tv.bai3();
                    break;
                case 4:
                    tv.bai4(sc);
                    break;
                case 5:
                    tv.bai5();

            }
        } while (choose < 6 || choose >= 1);
    }
}
