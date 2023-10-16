package Package;

/**
 *
 * @author phucl
 */
public class SinhVienPoly extends SinhVien {

    //1.Fields
    private int chuyenNganhHep;

    //2.Constructor
    public SinhVienPoly() {
    }

    public SinhVienPoly(int chuyenNganhHep, String maSV, String hoTen, String chuyenNganh) {
        super(maSV, hoTen, chuyenNganh);
        this.chuyenNganhHep = chuyenNganhHep;
    }

    //3.Get,set
    public int getChuyenNganhHep() {
        return chuyenNganhHep;
    }

    public void setChuyenNganhHep(int chuyenNganhHep) {
        this.chuyenNganhHep = chuyenNganhHep;
    }

    //4.Input,output
    @Override
    public void inThongTin() {
        System.out.println("Ma sv : " + getMaSV() + " - Ho ten : "
                + getHoTen() + " - Chuyen nganh : " + getHoTen()
                + " - Chuyen nganh : " + this.chuyenNganhHep);
    }
}
