package ThuVien;

import Polyfill.PFArray;
import Polyfill.StringHelper;

import java.nio.file.Path;

public class DanhSachDocGia implements DocGhiFile, ThaoTacFile {
    PFArray<DocGia> docGiaPFArray = new PFArray<>();// Lưu trữ danh sách độc giả vào mảng sau đó thực hiện thêm xóa sửa rồi ghi
                                             // mảng lại vào file

    @Override
    public void them() {
        DocGia docGia = new DocGia();
        docGia.nhapThongTin();
        docGiaPFArray.push_back(docGia);
    }

    @Override
    public void sua() {


    }

    @Override
    public void xoa() {

    }

    @Override
    public void docFile(Object o, Path path) {

    }

    @Override
    public void ghiFile(Object o, Path path) {

    }
}
