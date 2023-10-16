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
public class main {
    public static void main(String[] args) {
         SanPham sp1 = new SanPham();
        SanPham sp2 = new SanPham();
        sp1.nhap();
        sp1.xuat();
        sp2.nhap();
        sp2.xuat();
        SanPham sp3 = new SanPham();
        sp3.xuat();
        SanPham sp4 = new SanPham("SumSung",5000000,100000);
        sp4.xuat();
        
        
    }
}
