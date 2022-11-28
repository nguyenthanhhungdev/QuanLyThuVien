package Polyfill;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ThoiGian {
    public ThoiGian(int ngay, int thang, int nam) {
        instance = LocalDateTime.of(nam, thang, ngay, 0, 0, 0);
    }

    public ThoiGian(int ngay, int thang, int nam, int gio, int phut, int giay) {
        instance = LocalDateTime.of(nam, thang, ngay, gio, phut, giay);
    }

    // public ThoiGian(String formattedString) {
    //     instance = LocalDateTime.parse(formattedString, formatter);
    // }

    public ThoiGian(LocalDateTime instance) {
        this.instance = instance;
    }

    public int compareTo(ThoiGian thoiGian) {
        return instance.compareTo(thoiGian.instance);
    }

    public ThoiGian modNgay(int ngay) {
        return new ThoiGian(ngay > 0 ? instance.plusDays(ngay) : instance.minusDays(Math.abs(ngay)));
    }

    public ThoiGian plusKhoangThoiGian(KhoangThoiGian ktg) {
        return new ThoiGian(instance.plus(ktg.getInstance()));
    }
    public static ThoiGian parseTG(String inp) {
        return new ThoiGian(LocalDateTime.parse(inp, formatter));
    }
    @Override
    public String toString() {
        return instance.format(formatter);
    }

    public static ThoiGian now() {
        return new ThoiGian(LocalDateTime.now());
    }

    protected LocalDateTime getInstance() {
        return instance;
    }

    private final LocalDateTime instance;
    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
}
