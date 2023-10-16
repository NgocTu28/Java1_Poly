/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

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

    void inThongTin() {
        System.out.println("Ma GV: "+maGV);
        System.out.println("Ho ten: "+hoTen);
        System.out.println("Luong: "+luong);
    }
    
}
