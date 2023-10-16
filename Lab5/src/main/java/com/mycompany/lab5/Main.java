/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab5;

/**
 *
 * @author vutu8
 */
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        DanhSachHoTen danhSach = new DanhSachHoTen();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Vui lòng chọn chức năng:");
            System.out.println("1. Nhập danh sách họ và tên");
            System.out.println("2. Xuất danh sách vừa nhập");
            System.out.println("3. Xuất danh sách ngẫu nhiên");
            System.out.println("4. Sắp xếp giảm dần và xuất danh sách");
            System.out.println("5. Tìm và xóa họ tên nhập từ bàn phím");
            System.out.println("6. Kết thúc");
            System.out.println("Vui long nhap lua chon: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Nhập số lượng họ và tên:");
                    int n = scanner.nextInt();
                    scanner.nextLine();

                    for (int i = 0; i < n; i++) {
                        System.out.println("Nhập họ tên thứ " + (i + 1) + ":");
                        String ten = scanner.nextLine();
                        danhSach.addHoTen(new HoTen(ten));
                    }
                    break;

                case 2:
                    danhSach.print();
                    break;

                case 3:
                    danhSach.shuffle();
                    danhSach.print();
                    break;

                case 4:
                    danhSach.sort();
                    danhSach.print();
                    break;

                case 5:
                    System.out.println("Nhập họ tên cần xóa:");
                    String ten = scanner.nextLine();
                    danhSach.removeHoTen(ten);
                    break;
                case 6: 
                    System.exit(6);
            }

        }
    }
}
