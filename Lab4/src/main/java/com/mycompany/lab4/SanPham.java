/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab4;

import java.util.Scanner;

/**
 *
 * @author vutu8
 */
public class SanPham {

    private String tenSp;
    private double donGia;
    private double giamGia;

    public SanPham() {
    }

    public SanPham(String tenSp, double donGia, double giamGia) {
        this.tenSp = tenSp;
        this.donGia = donGia;
        this.giamGia = giamGia;
    }

    public String getTenSp() {
        return tenSp;
    }

    public void setTenSp(String tenSp) {
        this.tenSp = tenSp;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public double getGiamGia() {
        return giamGia;
    }

    public void setGiamGia(double giamGia) {
        this.giamGia = giamGia;
    }

    private double getThueNhapKhau() {
        return (donGia - giamGia) * 0.1;
    }

    void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten san pham: ");
        this.tenSp = sc.nextLine();
        System.out.println("Nhap don gia cua san pham: ");
        this.donGia = sc.nextDouble();
        System.out.println("Nhap giam gia cua san pham: ");
        this.giamGia = sc.nextDouble();
    }

    void xuat() {
        System.out.println("Hóa đơn thanh toán");
        System.out.println("Tên sản phẩm: " + tenSp);
        System.out.println("Đơn giá sản phẩm: " + donGia);
        System.out.println("Mã giảm giá: " + giamGia);
        System.out.println("Thuế nhập khẩu: " + getGiamGia());
        System.out.println("Tổng tiền phải trả: " + (donGia - giamGia + getThueNhapKhau()));
        System.out.println("--------------------------------------------------------");
    }
    
    
}
