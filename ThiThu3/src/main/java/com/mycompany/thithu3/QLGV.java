/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.thithu3;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author vutu8
 */
public class QLGV {

    List<GiaoVien> listGiaoVien;

    public QLGV() {
        listGiaoVien = new ArrayList<>();
    }

    void Bai1(Scanner sc) {

        do {
            sc.nextLine();
            System.out.println("Nhap vao ma giao vien: ");
            String maGV = sc.nextLine();
            System.out.println("Nhap vao ho va ten: ");
            String tenGV = sc.nextLine();
            System.out.println("Nhap vao luong: ");
            double luong = sc.nextDouble();
            sc.nextLine();

            System.out.println("Ban co la giao vien chu nghiem khong(Y/N): ");
            String isCN = sc.nextLine();

            if (isCN.equalsIgnoreCase("y")) {
                System.out.println("Nhap he so luong: ");
                double heSo = sc.nextDouble();
                System.out.println("Nhap phu cap: ");
                double phuCap = sc.nextDouble();
                sc.nextLine();
                listGiaoVien.add(new GiaoVienCN(phuCap, maGV, isCN, luong));
            } else {
                GiaoVien gv = new GiaoVien(maGV, tenGV, luong);
                listGiaoVien.add(gv);
            }

            System.out.println("Ban co muon tiep tuc khong(Y/N): ");
        } while (sc.nextLine().equalsIgnoreCase("y"));
    }

    void Bai2() {
        System.out.println("==========================================");
        if (listGiaoVien.isEmpty()) {
            System.out.println("Khong co du lieu");
        } else {

            for (GiaoVien i : listGiaoVien) {
                System.out.println(i.toString());
            }
            System.out.println("=======================================");
        }
    }

    void Bai3() {
        double luong = 0;
        for (GiaoVien i : listGiaoVien) {
            luong += i.getLuong();
        }

        double luongTb = luong / listGiaoVien.size();
        System.out.println("Luong trung binh cua tat ca cac giao vien: " + luongTb);
    }

    void Bai4(Scanner sc) {
        sc.nextLine();
        ArrayList<GiaoVien> list = new ArrayList<>();
        System.out.println("Nhap ma giao vien can xoa: ");
        String maGvXoa = sc.nextLine();
        for (GiaoVien i : listGiaoVien) {
            if (i.getMaGV().equalsIgnoreCase(maGvXoa)) {
                listGiaoVien.remove(i);
            }
        }
        System.out.println("=================== Danh sach sau khi xoa ===============");
        for (GiaoVien i : listGiaoVien) {
            System.out.println(i.toString());
        }
    }

}
