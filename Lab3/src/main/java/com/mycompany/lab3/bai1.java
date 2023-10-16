/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.lab3;

import java.util.Scanner;

/**
 *
 * @author vutu8
 */
public class bai1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập một số nguyên: ");
        int num = scanner.nextInt();

        boolean isPrime = true;

        if (num <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime == true) {
            System.out.println(num + " là số nguyên tố");
        } else {
            System.out.println(num + " không phải là số nguyên tố");
        }
    }

}
