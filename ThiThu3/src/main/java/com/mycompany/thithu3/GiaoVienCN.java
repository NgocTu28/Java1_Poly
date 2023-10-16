/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.thithu3;

/**
 *
 * @author vutu8
 */
public class GiaoVienCN extends GiaoVien {

    private double phuCap;

    public GiaoVienCN(double phuCap) {
        this.phuCap = phuCap;
    }

    public GiaoVienCN(double phuCap, String maGV, String hoTen, double luong) {
        super(maGV, hoTen, luong);
        this.phuCap = phuCap;
    }

    public double getPhuCap() {
        return phuCap;
    }

    public void setPhuCap(double phuCap) {
        this.phuCap = phuCap;
    }

    @Override
    public double getThuNhap() {
        double thuNhap;
        double heSo = 0;
        thuNhap = heSo * 14000000 + this.phuCap;
        return thuNhap;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "GiaoVien{" + "maGV=" + getMaGV() + ", hoTen=" + getHoTen() + ", luong=" + getLuong() + "Thu Nhap = " + getThuNhap();
    }

}
