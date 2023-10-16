/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.thithu1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author vutu8
 */
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        QLSV ql = new QLSV();
        int chon;
        boolean flag = true;
        do {
            System.out.print("1. Nhập 1 danh sách đối tượng (1đ)\n"
                    + "2. Xuất danh sách đối tượng (1đ)\n"
                    + "3. Tìm SV theo chuyenNganh (1đ)\n"
                    + "4. Sắp xếp danh sách các SV theo thuộc tính maSV(1đ)\n"
                    + "5. Ke thua \n"
                    + "0. Thoát\n"
                    + "Chon : ");
            chon = Integer.parseInt(scan.nextLine());

            switch (chon) {
                case 1:
                    ql.Bai1(scan);
                    break;
                case 2:
                    ql.Bai2();
                    break;
                case 3:
                    ql.Bai3(scan);
                    break;
                case 4:
                    ql.sapXepDanhSachTheoMaSv();
                    break;
                    
                case 5:
                    ql.keThua();
                default:
                    System.exit(0);
                    flag = false;
            }
        } while (flag = true);

    }
}
