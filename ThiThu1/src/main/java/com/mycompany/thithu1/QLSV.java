/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.thithu1;

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
        this.listSinhVien = new ArrayList<SinhVien>();
    }

    public void Bai1(Scanner sc) {
        int next = 1;
        while (next == 1) {

            System.out.println("Nhap vao ma sinh vien: ");
            String maSinhVien = sc.nextLine();
            System.out.println("Nhap vao ten sinh vien: ");
            String hoTen = sc.nextLine();
            System.out.println("Nhap vao chuyen nganh: ");
            String chuyenNganh = sc.nextLine();

            SinhVien sv = new SinhVien(maSinhVien, hoTen, chuyenNganh);
            listSinhVien.add(sv);

            System.out.println("Ban co muon tiep tuc khong (1.Tiep Tục / 0. Thoat): ");
            next = Integer.parseInt(sc.nextLine());
        }
    }

    public void Bai2() {
        if (listSinhVien.isEmpty()) {
            System.out.println("Khong co du lieu.");
        } else {
            for (SinhVien sv : listSinhVien) {
                sv.inThongTin();
            }
        }
    }

    public void Bai3(Scanner sc) {
        ArrayList<SinhVien> list = new ArrayList<>();
        if (listSinhVien.isEmpty()) {
            System.out.println("Khong co du lieu.");
        } else {
            System.out.println("Hay nhap vao chuyen nganh tim: ");
            String chuyenNganhTin = sc.nextLine();
            for (SinhVien sv : listSinhVien) {
                if (sv.getChuyenNganh().equalsIgnoreCase(chuyenNganhTin)) {
                    list.add(sv);
                }
            }
        }
        if (list.isEmpty()) {
            System.out.println("Khong co du lieu");
        } else {
            for (SinhVien sv : list) {
                sv.inThongTin();
            }
        }
    }

    public void sapXepDanhSachTheoMaSv() {
        System.out.println("============= danh sach sau khi sap xep =================");
        listSinhVien.sort((o1, o2) -> o1.getMaSV().compareToIgnoreCase(o2.getMaSV()));
        Bai2();
    }
    
    public void keThua (){
        SinhVien svpl = new SinhVienPoly(1, "PH32035", "Vungoctu", "KTPM");
        svpl.inThongTin();
    }
}
