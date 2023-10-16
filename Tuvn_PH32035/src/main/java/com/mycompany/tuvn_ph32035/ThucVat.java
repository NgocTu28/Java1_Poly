/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tuvn_ph32035;

/**
 *
 * @author vutu8
 */
public class ThucVat {

    private String ID;
    private String theLoai;
    private int tuoiTho;

    public ThucVat() {
    }

    public ThucVat(String ID, String theLoai, int tuoiTho) {
        this.ID = ID;
        this.theLoai = theLoai;
        this.tuoiTho = tuoiTho;
    }

    public int getTuoiTho() {
        return tuoiTho;
    }

    public void setTuoiTho(int tuoiTho) {
        this.tuoiTho = tuoiTho;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getTheLoai() {
        return theLoai;
    }

    public void setTheLoai(String theLoai) {
        this.theLoai = theLoai;
    }

    void inThongTin() {
        System.out.println("ID: " + ID);
        System.out.println("The Loai: " + theLoai);
        System.out.println("Tuoi Tho: " + tuoiTho);
    }
}
