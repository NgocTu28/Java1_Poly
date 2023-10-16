/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.thithu3;

import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author vutu8
 */
public class Main {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        QLGV qlgv = new QLGV();
        
        int choice;
        do {
            System.out.println("+---------------------------------------Menu---------------------------------------+");
            System.out.println("1.Nhập danh sách giáo viên");
            System.out.println("Khi nhập có hỏi tiếp hay không?");
            System.out.println("2.Xuất danh sách giáo viên");
            System.out.println("3.Tính trung bình lương tất cả các giáo viên");
            System.out.println("4. Xóa nhân viên theo mã nhập từ bàn phím");
            System.out.println("0.Thoát");
            System.out.println("+------------------------------------------------------------------------------+");
            
            System.out.print("Nhập lựa chọn của bạn: ");
            choice = scanner.nextInt();
            
            switch (choice) {
                case 0:
                    System.out.println("Đã thoát chương trình!");
                    break;
                case 1:
                    qlgv.Bai1(scanner);
                    break;
                case 2:
                    qlgv.Bai2();
                    break;
                case 3:
                    qlgv.Bai3();
                    break;
                case 4:
                    
                    qlgv.Bai4(scanner);
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại!");
            }
        } while (choice != 0);
        
        scanner.close();
    }
}
