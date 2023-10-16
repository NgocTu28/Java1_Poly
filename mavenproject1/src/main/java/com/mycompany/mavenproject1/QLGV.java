/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author vutu8
 */
public class QLGV {

   
    List<GiaoVien> listGiaoVien;

    public QLGV() {
        this.listGiaoVien = new ArrayList<>();
    }

    void nhapDanhSach(Scanner sc) {
        String chon;

        do {            
            System.out.println("Nhap vao ma giao vien: ");
            String maGV = sc.nextLine();
            System.out.println("Nhap vao ho ten: ");
            String hoTen = sc.nextLine();
            System.out.println("Nhap vao luong: ");
            double luong = sc.nextDouble();
            sc.nextLine();
            GiaoVien gv = new GiaoVien(maGV, hoTen, luong);
            listGiaoVien.add(gv);
            System.out.println("Ban co muon tiep tuc khong (Y/N): ");
            chon = sc.nextLine();
        } while (chon.equalsIgnoreCase("y"));

    }

    void xuatDanhSach() {
        if (listGiaoVien.isEmpty()) {
            System.out.println("Khong co du lieu.");
        } else {
            System.out.println("=========== Danh sach giao vien =========");
            for (GiaoVien i : listGiaoVien) {
                i.inThongTin();
            }
        }
    }

    void timGiaoVienTheoKhoangLuong(Scanner sc) {
        ArrayList<GiaoVien> list = new ArrayList<>();
        System.out.println("Khoang luong MAX: ");
        double luongMax = sc.nextDouble();
        System.out.println("khoang luong MIN: ");
        double luongMin = sc.nextDouble();
        if (listGiaoVien.isEmpty()) {
            System.out.println("Khong co du lieu.");
        } else {
            for (GiaoVien giaoVien : listGiaoVien) {
                if (giaoVien.getLuong() <= luongMax && giaoVien.getLuong() >= luongMin) {
                    list.add(giaoVien);
                }
            }
        }

        if (list.isEmpty()) {
            System.out.println("Khong co du lieu.");
        } else {
            for (GiaoVien i : list) {
                i.inThongTin();
            }
        }
    }

    void timGiaoVienTheoTen(Scanner sc) {
        ArrayList<GiaoVien> list = new ArrayList<>();
        System.out.println("Nhap ten muon tim: ");
        String ten = sc.nextLine();

        for (GiaoVien i : listGiaoVien) {
            if (i.getHoTen().equalsIgnoreCase(ten)) {
                list.add(i);
            }
        }
        if (list.isEmpty()) {
            System.out.println("Khong co du lieu.");
        } else {
            for (GiaoVien i : list) {
                i.inThongTin();
            }
        }

    }

    void sapXep() {
        listGiaoVien.sort((gv1, gv2) -> Double.compare(gv2.getLuong(), gv1.getLuong()));
        
        xuatDanhSach();
    }
}
