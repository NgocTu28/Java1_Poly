package Package;

/**
 *
 * @author phucl
 */
public class SinhVien {

    //1.Fields
    private String maSV;
    private String hoTen;
    private String chuyenNganh;

    //2.Constructor
    public SinhVien() {
    }

    public SinhVien(String maSV, String hoTen, String chuyenNganh) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.chuyenNganh = chuyenNganh;
    }

    //3.Get,set
    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getChuyenNganh() {
        return chuyenNganh;
    }

    public void setChuyenNganh(String chuyenNganh) {
        this.chuyenNganh = chuyenNganh;
    }

    //4.Input,output
    public void inThongTin() {
        System.out.println("Ma sv : " + this.maSV + " - Ho ten : "
                + this.hoTen + " - Chuyen nganh : " + this.chuyenNganh);
    }
}
