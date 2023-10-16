/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.thithu4;

/**
 *
 * @author vutu8
 */
public class SinhVienIT extends SinhVien {

    double diemJava;

    public SinhVienIT(double diemJava) {
        this.diemJava = diemJava;
    }

    public SinhVienIT(double diemJava, String maSV, String hoTen, double diemToan, double diemVan) {
        super(maSV, hoTen, diemToan, diemVan);
        this.diemJava = diemJava;
    }

    public double getDiemJava() {
        return diemJava;
    }

    public void setDiemJava(double diemJava) {
        this.diemJava = diemJava;
    }

    @Override
    public double tongDiem() {
        double tongDiem;
        tongDiem = (getDiemToan() + getDiemVan() + (diemJava * 2)) / 4;
        return tongDiem;
    }

    @Override
    public String toString() {
        return "SinhVien{" + "maSV=" + getMaSV() + ", hoTen=" + getHoTen() + ", diemToan=" + getDiemToan() + ", diemVan=" + getDiemVan() + "diem Java = " + diemJava + "Tong diem = " + tongDiem();
    }
}
