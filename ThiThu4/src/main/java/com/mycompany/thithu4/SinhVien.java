/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.thithu4;

/**
 *
 * @author vutu8
 */
public class SinhVien {

    private String maSV;
    private String hoTen;
    private double diemToan;
    private double diemVan;

    public SinhVien() {
    }

    public SinhVien(String maSV, String hoTen, double diemToan, double diemVan) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.diemToan = diemToan;
        this.diemVan = diemVan;
    }

    public double getDiemVan() {
        return diemVan;
    }

    public void setDiemVan(double diemVan) {
        this.diemVan = diemVan;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public double getDiemToan() {
        return diemToan;
    }

    public void setDiemToan(double diemToan) {
        this.diemToan = diemToan;
    }

    public double tongDiem() {
        double tongDiem;
        tongDiem = (getDiemToan() * 2) + getDiemVan();
        return tongDiem;
    }

    public String xepLoai() {

        if (tongDiem() < 15) {
            return "rot";
        } else {
            return "dau";
        }
    }

    @Override
    public String toString() {
        return "SinhVien{" + "maSV=" + maSV + ", hoTen=" + hoTen + ", diemToan=" + diemToan + ", diemVan=" + diemVan + "Tong diem = " + tongDiem();
    }

}
