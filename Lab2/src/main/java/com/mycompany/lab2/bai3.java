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
public class bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập số điện sử dụng của tháng
        System.out.print("Nhập số điện sử dụng của tháng: ");
        int electric = scanner.nextInt();

        // Tính tiền điện
        int price = 0;
        if (electric <= 50) {
            price = electric * 1000;
        } else {
            price = 50 * 1000 + (electric - 50) * 1200;
        }

        // In ra tiền điện
        System.out.println("Tiền điện trong tháng là: " + price + " đồng");

    }
}
