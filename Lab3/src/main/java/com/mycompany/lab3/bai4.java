/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab3;

import java.util.Scanner;

/**
 *
 * @author vutu8
 */
public class bai4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so sinh vien:");
        int n = sc.nextInt();

        String[] hoten = new String[n];
        Float[] diem = new Float[n];
        String[] hocLuc = new String[n];
// Nhap vao 2 mang ho ten va diem.
        for (int i = 0; i < n; i++) {

            System.out.println("Nhap vao ten sinh vien" + i + ":");
            hoten[i] = sc.next();
            System.out.println("Nhap vao diem cua sinh vien" + i + ":");
            diem[i] = sc.nextFloat();
        }

        for (int i = 0; i < n; i++) {
            System.out.println("Ho Ten" + i + ":" + hoten[i]);
            System.out.println("Diem: " + diem[i]);

// Xét học lực .
            if (diem[i] < 5) {
                hocLuc[i] = "Yeu";
            } else if (diem[i] < 6.5) {
                hocLuc[i] = "Trung Binh";
            } else if (diem[i] < 7.5) {
                hocLuc[i] = "Kha";
            } else if (diem[i] < 9) {
                hocLuc[i] = "Gioi";
            } else {
                hocLuc[i] = "Xuat sac";
            }
        }

//Sắp xếp danh sách sinh viên theo điểm.   
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (diem[i] > diem[j]) {

                    String tempHoTen = hoten[i];
                    hoten[i] = hoten[j];
                    hoten[j] = tempHoTen;

                    Float tempDiem = diem[i];
                    diem[i] = diem[j];
                    diem[j] = tempDiem;

                    String tempHocLuc = hocLuc[i];
                    hocLuc[i] = hocLuc[j];
                    hocLuc[j] = tempHocLuc;

                }

            }
        }

// Xuất danh sách.  
        System.out.println("Danh sách sinh viên:");
        for (int i = 0; i < n; i++) {
            System.out.println("Sinh Vien Thứ" + (i + 1) + ":");
            System.out.println("Ho Ten: " + hoten[i]);
            System.out.println("Điem: " + diem[i]);
            System.out.println("Hoc luc: " + hocLuc[i]);
        }

    }
}
