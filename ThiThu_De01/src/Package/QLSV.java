package Package;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author phucl
 */
public class QLSV {

    //1.Fields
    List<SinhVien> listSinhVien;

    //2.Constructor
    public QLSV() {
        this.listSinhVien = new ArrayList<SinhVien>();
    }

    public QLSV(List<SinhVien> listSinhVien) {
        this.listSinhVien = listSinhVien;
    }

    //3.Methods
    public void bai1(Scanner scan) {
        int tiepTuc = 1;
        while (tiepTuc == 1) {
            System.out.println("Nhap thong tin sinh vien : ");
            System.out.print("Nhap ma sinh vien : ");
            String ma = scan.nextLine();
            System.out.print("Nhap ten sinh vien : ");
            String ten = scan.nextLine();
            System.out.print("Nhap chuyen nganh hoc : ");
            String chuyenNganh = scan.nextLine();
            SinhVien sv = new SinhVien(ma, ten, chuyenNganh);
            this.listSinhVien.add(sv);
            System.out.print("Co muon tiep tuc khong : \n1. Tiep tuc."
                    + "\n0.Dung lai.\nChon : ");
            tiepTuc = Integer.parseInt(scan.nextLine());
        }
    }

    public void bai2() {
        if (!this.listSinhVien.isEmpty()) {
            for (SinhVien sv : this.listSinhVien) {
                sv.inThongTin();
            }
        } else {
            System.out.println("Danh sach sinh vien trong.");
        }
    }

    public ArrayList<SinhVien> bai3(Scanner scan) {
        ArrayList<SinhVien> list = new ArrayList<>();
        if (!this.listSinhVien.isEmpty()) {
            System.out.println("Nhap chuyen nganh ");
            String chuyenNganh = scan.nextLine();
            for (SinhVien sv : this.listSinhVien) {
                if (sv.getChuyenNganh().equalsIgnoreCase(chuyenNganh)) {
                    list.add(sv);
                }
            }
        } else {
            System.out.println("Danh sach trong.");
        }
        return list;
    }

    public void output(ArrayList<SinhVien> list) {
        if (!list.isEmpty()) {
            for (SinhVien sv : this.listSinhVien) {
                sv.inThongTin();
            }
        } else {
            System.out.println("Khong co sinh vien trong danh sach");
        }
    }

    public void bai4() {
        System.out.println("Danh sach sinh vien da sap xep : ");
        this.listSinhVien.sort((o1, o2) -> o1.getMaSV().compareToIgnoreCase(o2.getMaSV()));
    }

    public void bai5(Scanner scan) {
        SinhVien sv = new SinhVienPoly(3, "PH3210", "ABC", "IT");
        sv.inThongTin();
    }
}
