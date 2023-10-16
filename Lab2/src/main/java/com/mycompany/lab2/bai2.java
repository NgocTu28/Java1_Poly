/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab2;

import java.util.Scanner;

/**
 *
 * @author vutu8
 */
public class bai2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập hệ số a, b và c từ bàn phím
        System.out.print("Nhập hệ số a: ");
        double a = scanner.nextDouble();
        System.out.print("Nhập hệ số b: ");
        double b = scanner.nextDouble();
        System.out.print("Nhập hệ số c: ");
        double c = scanner.nextDouble();

        // Giải phương trình bậc hai
        double delta = b * b - 4 * a * c;
        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    System.out.println("Phương trình có vô số nghiệm");
                } else {
                    System.out.println("Phương trình vô nghiệm");
                }
            } else {
                double x = -c / b;
                System.out.println("Phương trình có nghiệm duy nhất: " + x);
            }
        } else {
            if (delta < 0) {
                System.out.println("Phương trình vô nghiệm");
            } else if (delta == 0) {
                double x = -b / (2 * a);
                System.out.println("Phương trình có nghiệm kép: " + x);
            } else {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("Phương trình có hai nghiệm phân biệt: " + x1 + " và " + x2);
            }
        }
    }
}
