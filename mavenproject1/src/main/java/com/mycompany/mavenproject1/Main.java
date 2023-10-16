/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

import java.util.Scanner;

/**
 *
 * @author vutu8
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QLGV ql = new QLGV();
        int choose;
        do {
            System.out.println("1. Nhap danh sach. ");
            System.out.println("2. Xuat danh sach. ");
            System.out.println("3. Tim giao vien theo khoang luong.");
            System.out.println("4. Tim giao vien theo ten.");
            System.out.println("5. Sap xep giao vien giam dan.");
            System.out.println("0. Thoat. ");
            System.out.println("Nhap vao lua chon cua ban: ");
            choose = sc.nextInt();
            sc.nextLine();
            switch (choose) {
                case 1:
                    ql.nhapDanhSach(sc);
                    break;
                case 2:
                    ql.xuatDanhSach();
                    break;
                case 3:
                    ql.timGiaoVienTheoKhoangLuong(sc);
                    break;
                case 4:
                    ql.timGiaoVienTheoTen(sc);
                    break;
                case 5:
                    ql.sapXep();
                    break;
                default:
                    System.exit(0);
            }
        } while (true);
    }
}
