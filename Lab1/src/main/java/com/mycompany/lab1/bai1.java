/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.lab1;

import java.util.Scanner;

/**
 *
 * @author vutu8
 */
public class bai1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao ho ten: ");
        String hoten = scanner.nextLine();
        System.out.println("Nhap vao diem TB: ");
        Float DTB = scanner.nextFloat();

        System.out.printf(" %s %.1f diem ", hoten, DTB);

    }
}
