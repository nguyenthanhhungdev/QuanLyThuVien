package ThuVien;

import Polyfill.ThoiGian;

public class DocGia extends ConNguoi implements TraCuuTaiLieu, MuonTaiLieu {
    private The the;
    private DanhSachTaiLieuDKMuon danhSachTaiLieuDKMuon;
    private String maCMND;
    private String email;
    private String soDienThoai;
    private DanhSachTaiLieuDaMuon danhSachTaiLieuDaMuon;

    public DocGia(String hoTen, ThoiGian ngaySinh, String diaChi) {
        super(hoTen, ngaySinh, diaChi);
    }

    public DocGia(The the) {
        this.the = the;
    }

    public DocGia() {
    }

    public The getThe() {
        return the;
    }

    public void setThe(The the) {
        this.the = the;
    }

    public String getMaCMND() {
        return maCMND;
    }

    public void setMaCMND(String maCMND) {
        boolean run = false;
        do {
            String regex = "[1-9]";
            if (maCMND.matches(regex)) {
                this.maCMND = maCMND;
                run = true;
            } else {
                System.out.println("Nhap lai ma CMND: ");
                maCMND = Global.scanner.nextLine();
            }
        } while (!run);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        boolean run = false;
        do {
            String regex = "[^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$]";
            if (email.matches(regex)) {
                this.email = email;
            } else {
                System.out.println("Nhap lai email: ");
                email = Global.scanner.nextLine();
            }
        } while (!run);
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        boolean run = false;
        do {
            String regex = "[\\d{10}|(?:\\d{3} -){2}\\d{4}|\\(\\d{3}\\)\\d{3} -?\\d{4}]";
            if (soDienThoai.matches(regex)) {
                this.soDienThoai = soDienThoai;
            } else {
                System.out.println("Nhap lai so dien thoai: ");
                soDienThoai = Global.scanner.nextLine();
            }
        } while (!run);

    }

    @Override
    public void traCuu() {

    }

    @Override
    public void choMuon() {

    }

    @Override
    public void nhapThongTin() {
        System.out.println("Nhap thong tin doc gia: ");
        System.out.println("Nhap ten: ");
        setHoTen(Global.scanner.nextLine());
        System.out.println("Nhap ngay sinh: ");
        setNgaySinh(ThoiGian.parseTG(Global.scanner.nextLine()));
        System.out.println("Nhap dia chi: ");
        setDiaChi(Global.scanner.nextLine());
        System.out.println("Nhap so CMND: ");
        setMaCMND(Global.scanner.nextLine());
        System.out.println("Nhap email: ");
        setEmail(Global.scanner.nextLine());
        System.out.println("Nhap so dien thoai: ");
        setSoDienThoai(Global.scanner.nextLine());
    }
}
