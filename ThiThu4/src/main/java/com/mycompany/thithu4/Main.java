/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.thithu4;

import java.util.Scanner;

/**
 *
 * @author vutu8
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QLSV qlsv = new QLSV();
        int choose;
        do {
            System.out.println("1. Nhap danh sach.");
            System.out.println("2. Xuat danh sach.");
            System.out.println("3. Tim sinh vien theo diem toan.");
            System.out.println("4. Xoa nhan vien theo ma.");
            System.out.println("0. Thoat.");
            System.out.println("Vui long nhap lua chon cua ban: ");
            choose = sc.nextInt();

            switch (choose) {
                case 1:
                    qlsv.Bai1(sc);
                    break;
                case 2:
                    qlsv.Bai2();
                    break;
                case 3:
                    qlsv.Bai3(sc);
                    break;
                case 4:
                    qlsv.Bai4(sc);
                    break;
                case 5:
                    qlsv.Bai5();
                case 0:
                    System.out.println("Ban da thoat chuong trinh.");
                    break;
            }
        } while (choose < 6);
    }
}
