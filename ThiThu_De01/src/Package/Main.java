package Package;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author phucl
 */
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        QLSV ql = new QLSV();
        doMenu(scan, ql);
    }

    public static void printMenu() {
        System.out.print("1. Nhập 1 danh sách đối tượng (1đ)\n"
                + "2. Xuất danh sách đối tượng (1đ)\n"
                + "3. Tìm SV theo chuyenNganh (1đ)\n"
                + "4. Sắp xếp danh sách các SV theo thuộc tính maSV(1đ)\n"
                + "5. Ke thua \n"
                + "0. Thoát\n"
                + "Chon : ");
    }

    public static void doMenu(Scanner scan, QLSV ql) {
        boolean flag = true;
        while (flag) {
            printMenu();
            int chon = Integer.parseInt(scan.nextLine());
            switch (chon) {
                case 1 -> {
                    ql.bai1(scan);
                }
                case 2 -> {
                    ql.bai2();
                }
                case 3 -> {
                    ArrayList<SinhVien> list = ql.bai3(scan);
                    ql.output(list);
                }
                case 4 -> {
                    ql.bai4();
                    ql.bai2();
                }
                case 5 -> {
                    ql.bai5(scan);
                }
                case 0 -> {
                    System.out.println("Tam biet.");
                    flag = false;
                }
            }
        }
    }
}
