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
public class bai2 {
    
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập chiều dài của hình chữ nhật: ");
        double length = scanner.nextDouble();

        System.out.print("Nhập chiều rộng của hình chữ nhật: ");
        double width = scanner.nextDouble();

        double perimeter = 2 * (length + width);
        double area = length * width;
        double smallerSide = (length < width) ? length : width;

        System.out.println("Chu vi của hình chữ nhật là: " + perimeter);
        System.out.println("Diện tích của hình chữ nhật là: " + area);
        System.out.println("Cạnh nhỏ của hình chữ nhật là: " + smallerSide);
    }
}
