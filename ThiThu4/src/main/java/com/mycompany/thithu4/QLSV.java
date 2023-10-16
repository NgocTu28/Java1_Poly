/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.thithu4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author vutu8
 */
public class QLSV {

    List<SinhVien> listSinhVien;

    public QLSV() {
        listSinhVien = new ArrayList<>();
    }

    public void Bai1(Scanner sc) {
        do {
            sc.nextLine();
            System.out.println("Nhap vao ma sinh vien: ");
            String maSinhVien = sc.nextLine();
            System.out.println("Nhap vao ho ten sinh vien: ");
            String hoTen = sc.nextLine();
            System.out.println("Nhap vao diem toan: ");
            double diemToan = sc.nextDouble();
            System.out.println("Nhap vao diem van: ");
            double diemVan = sc.nextDouble();
            sc.nextLine();
            SinhVien sv = new SinhVien(hoTen, hoTen, diemToan, diemVan);
            listSinhVien.add(sv);

            System.out.println("Ban co muon tiep tuc khong: ");
        } while (sc.nextLine().equalsIgnoreCase("Y"));
    }

    public void Bai2() {
        if (listSinhVien.isEmpty()) {
            System.out.println("Khong co du lieu trong danh sach. ");
        } else {
            for (SinhVien i : listSinhVien) {
                System.out.println(i.toString());
            }
        }
    }

    public void Bai3(Scanner sc) {
        ArrayList<SinhVien> sv = new ArrayList<>();
        System.out.println("Nhap vao khoang diem MAX: ");
        double diemMax = sc.nextDouble();
        System.out.println("Nhap vao khoang diem MIN: ");
        double diemMin = sc.nextDouble();

        if (listSinhVien.isEmpty()) {
            System.out.println("Khong co du lieu trong danh sach. ");
        } else {
            for (SinhVien i : listSinhVien) {
                if (i.getDiemToan() <= diemMax && i.getDiemToan() >= diemMin) {
                    sv.add(i);
                }
            }
        }

        if (listSinhVien.isEmpty()) {
            System.out.println("Khong co du lieu trong danh sach. ");
        } else {
            for (SinhVien i : sv) {
                System.out.println(i.toString());
            }
        }
    }

    public void Bai4(Scanner sc) {
        sc.nextLine();
        if (listSinhVien.isEmpty()) {
            System.out.println("Khong co du lieu trong danh sach. ");
        } else {
            System.out.println("Nhap vao ma sinh vien: ");
            String maSv = sc.nextLine();
            for (SinhVien i : listSinhVien) {
                if (i.getMaSV().equalsIgnoreCase(maSv)) {
                    listSinhVien.remove(i);
                }
            }
        }

        System.out.println("========== Danh sach sau khi sap xep =========");
        for (SinhVien i : listSinhVien) {
            System.out.println(i.toString());
        }
    }

    public void Bai5() {
        SinhVien svpl = new SinhVienIT(9.6, "PH3456", "Vu Ngoc Tu", 8.0, 9.0);
        Bai2();
    }

}
