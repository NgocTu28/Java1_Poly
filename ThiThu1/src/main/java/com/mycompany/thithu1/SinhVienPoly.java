/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.thithu1;

/**
 *
 * @author vutu8
 */
public class SinhVienPoly extends SinhVien{
    private int chuyenNganhHep;

    public SinhVienPoly(int chuyenNganhHep) {
        this.chuyenNganhHep = chuyenNganhHep;
    }

    public SinhVienPoly(int chuyenNganhHep, String maSV, String hoTen, String chuyenNganh) {
        super(maSV, hoTen, chuyenNganh);
        this.chuyenNganhHep = chuyenNganhHep;
    }

    public int getChuyenNganhHep() {
        return chuyenNganhHep;
    }

    public void setChuyenNganhHep(int chuyenNganhHep) {
        this.chuyenNganhHep = chuyenNganhHep;
    }
    
    
}
