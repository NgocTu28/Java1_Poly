/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab1;

import java.util.Scanner;

/**
 *
 * @author vutu8
 */
public class bai3 {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập cạnh của khối lập phương: ");
        double edge = scanner.nextDouble();

        double volume = Math.pow(edge, 3);

        System.out.println("Thể tích của khối lập phương là: " + volume);

    }
}
