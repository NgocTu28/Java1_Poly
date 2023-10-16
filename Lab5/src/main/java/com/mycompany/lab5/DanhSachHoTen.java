/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab5;

/**
 *
 * @author vutu8
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class DanhSachHoTen {

    private ArrayList<HoTen> danhSach;

    public DanhSachHoTen() {
        danhSach = new ArrayList<HoTen>();
    }

    public void addHoTen(HoTen hoTen) {
        danhSach.add(hoTen);
    }

    public void removeHoTen(String ten) {
        for (int i = 0; i < danhSach.size(); i++) {
            if (danhSach.get(i).getTen().equals(ten)) {
                danhSach.remove(i);
                return;
            }
        }
    }

    public void print() {
        for (HoTen hoTen : danhSach) {
            System.out.println(hoTen.getTen());
        }
    }

    public void shuffle() {
        Collections.shuffle(danhSach, new Random());
    }

    public void sort() {
        Collections.sort(danhSach, (a, b) -> b.getTen().compareTo(a.getTen()));
    }
}
