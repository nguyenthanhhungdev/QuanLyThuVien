package ThuVien;

import Polyfill.ThoiGian;

public abstract class ConNguoi {
    private String hoTen;
    private ThoiGian ngaySinh;
    private String diaChi;

    public ConNguoi(String hoTen, ThoiGian ngaySinh, String diaChi) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
    }

    public ConNguoi() {
    }

    public abstract void nhapThongTin();

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public ThoiGian getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(ThoiGian ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
}
