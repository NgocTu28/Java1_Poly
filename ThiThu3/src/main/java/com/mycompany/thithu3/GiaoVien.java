/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.thithu3;

/**
 *
 * @author vutu8
 */
public class GiaoVien {

    private String maGV;
    private String hoTen;
    private double luong;

    public GiaoVien() {
    }

    public GiaoVien(String maGV, String hoTen, double luong) {
        this.maGV = maGV;
        this.hoTen = hoTen;
        this.luong = luong;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }

    public String getMaGV() {
        return maGV;
    }

    public void setMaGV(String maGV) {
        this.maGV = maGV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public double getThue() {
        double thue;
        if (getLuong() < 9000000) {
            thue = 0;
        } else if (getLuong() < 15000000) {
            thue = (getLuong() - 9000000) * 0.1;
        } else if (getLuong() < 30000000) {
            thue = (getLuong() - 15000000) * 0.15 + 600000;
        } else {
            thue = 0.2 * (getThue() - 30000000) + 2100000;
        }
        return thue;
    }

    public double getThuNhap() {
        double thuNhap;
        thuNhap = getLuong() * 12 - getThue();
        return thuNhap;
    }

    @Override
    public String toString() {
        return "GiaoVien{" + "maGV=" + maGV + ", hoTen=" + hoTen + ", luong=" + luong + "Thue =" + getThue() + "Thu Nhap = " + getThuNhap();
    }

}
