/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tuvn_ph32035;

/**
 *
 * @author vutu8
 */
public class Hoa extends ThucVat {

    private String tenHoa;
    private String mauSac;

    public Hoa(String tenHoa, String mauSac) {
        this.tenHoa = tenHoa;
        this.mauSac = mauSac;
    }

    public Hoa(String tenHoa, String mauSac, String ID, String theLoai, int tuoiTho) {
        super(ID, theLoai, tuoiTho);
        this.tenHoa = tenHoa;
        this.mauSac = mauSac;
    }

    public String getMauSac() {
        return mauSac;
    }

    public void setMauSac(String mauSac) {
        this.mauSac = mauSac;
    }

    public String getTenHoa() {
        return tenHoa;
    }

    public void setTenHoa(String tenHoa) {
        this.tenHoa = tenHoa;
    }

    @Override
    void inThongTin() {
        System.out.println("ID: " + getID());
        System.out.println("The Loai: " + getTheLoai());
        System.out.println("Tuoi Tho: " + getTuoiTho());
        System.out.println("Ten Hoa: " + tenHoa);
        System.out.println("Mau Sac: " + tenHoa);
    }
}
