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
public class bai4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        do {
            menu(); // Xuất ra màn hình thực đơn
            System.out.print("Chọn chức năng: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Gọi phương thức giải phương trình bậc nhất
                    System.out.print("Nhập hệ số a: ");
                    double a1 = scanner.nextDouble();
                    System.out.print("Nhập hệ số b: ");
                    double b2 = scanner.nextDouble();

                    giaiPTB1(a1,b2);
                    break;

                case 2:
                    // Gọi phương thức giải phương trình bậc hai
                    System.out.print("Nhập hệ số a: ");
                    double a = scanner.nextDouble();
                    System.out.print("Nhập hệ số b: ");
                    double b = scanner.nextDouble();
                    System.out.print("Nhập hệ số c: ");
                    double c = scanner.nextDouble();
                    giaiPTB2(a, b, c);
                    break;
                case 3:
                    // Gọi phương thức tính tiền điện
                    // Nhập số điện sử dụng của tháng
                    System.out.print("Nhập số điện sử dụng của tháng: ");
                    int electric = scanner.nextInt();

                    tinhTienDien(electric);

                    break;
                case 4:
                    System.out.println("Kết thúc chương trình.");
                    break;
                default:
                    System.out.println("Chức năng không hợp lệ. Vui lòng chọn lại.");
                    break;
            }
        } while (choice != 4);
    }

    public static void menu() {
        System.out.println("+---------------------------------------------------+");
        System.out.println("1. Giải phương trình bậc nhất");
        System.out.println("2. Giải phương trình bậc 2");
        System.out.println("3. Tính tiền điện");
        System.out.println("4. Kết thúc");
        System.out.println("+---------------------------------------------------+");
    }

    public static void giaiPTB1(double a1, double b2) {

        // Giải phương trình bậc nhất
        if (a1 == 0) {
            if (b2 == 0) {
                System.out.println("Phương trình có vô số nghiệm");
            } else {
                System.out.println("Phương trình vô nghiệm");
            }
        } else {
            double x = -b2 / a1;
            System.out.println("Nghiệm của phương trình là: " + x);
        }
    }

    public static void giaiPTB2(double a, double b, double c) {

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

    public static void tinhTienDien(int electric) {
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
