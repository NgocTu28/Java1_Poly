/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author vutu8
 */
public class bai3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so ki tu cua mang: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Nhap vao mang so nguyen.
        for (int i = 0; i < n; i++) {
            System.out.println("a[" + i + "]=");
            arr[i] = sc.nextInt();
        }

        //sap xep mang.
        Arrays.sort(arr);
        // Xuat ra man hinh
        System.out.println("Mang sau khi da sap xep: ");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i] + " ");
        }

        // Xuat phan tu co gia tri nho nhat ra man hinh
        int min = arr[0];
        for (int i = 0; i < n; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println("Phan tu co gia tri nho nhat: " + min);

        // Tinh va xuat ra man hinh trung binh cong cac so chia het cho 3
        int count = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] % 3 == 0) {
                count++;
                sum += arr[i];
            }
        }
        double AVG = (double) sum / count;
        System.out.println("Trung binh cac so chia het 3: " + AVG);
    }
}
