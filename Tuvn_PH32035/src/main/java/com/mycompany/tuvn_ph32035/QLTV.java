/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tuvn_ph32035;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author vutu8
 */
public class QLTV {

    List<ThucVat> listThucVat;

    public QLTV() {
        listThucVat = new ArrayList<>();
    }

    void bai1(Scanner sc) {
        String tiepTuc;
        do {
            sc.nextLine();
            System.out.println("Nhap vao id: ");
            String id = sc.nextLine();
            System.out.println("Nhap vao the loai: ");
            String theLoai = sc.nextLine();
            System.out.println("Nhap vao tuoi tho: ");
            int tuoiTho = sc.nextInt();

            sc.nextLine();
            ThucVat tv = new ThucVat(id, theLoai, tuoiTho);
            listThucVat.add(tv);

            System.out.println("Ban co muon tiep tuc khong (Y/N): ");
            tiepTuc = sc.nextLine();

        } while (tiepTuc.equalsIgnoreCase("Y"));
    }

    void bai2() {
        if (listThucVat.isEmpty()) {
            System.out.println("Khong co du lieu de thuc hien.");
        } else {
            for (ThucVat i : listThucVat) {
                i.inThongTin();
            }
        }
    }

    void bai3() {
        if (listThucVat.isEmpty()) {
            System.out.println("Khong co du lieu de thuc hien.");
        } else {
            listThucVat.sort((o1, o2) -> Integer.compare(o2.getTuoiTho(), o1.getTuoiTho()));
            bai2();
        }
    }

    void bai4(Scanner sc) {
        ArrayList<ThucVat> list = new ArrayList<>();
        if (listThucVat.isEmpty()) {
            System.out.println("Khong co du lieu de thuc hien.");
        } else {
            System.out.println("Nhap vao khoang tuoi tho: ");
            int khoangTuoiTho = sc.nextInt();
            for (ThucVat i : listThucVat) {
                if (i.getTuoiTho() == khoangTuoiTho) {
                    list.add(i);
                }
            }
        }
        if (list.isEmpty()) {
            System.out.println("Khong tim thay thuc vat.");
        } else {
            for (ThucVat i : list) {
                i.inThongTin();
            }
        }

    }

    void bai5() {
        ThucVat tv = new Hoa("Hoa Mai", "Vang", "H001", "Mai", 7);
        tv.inThongTin();
    }
}
