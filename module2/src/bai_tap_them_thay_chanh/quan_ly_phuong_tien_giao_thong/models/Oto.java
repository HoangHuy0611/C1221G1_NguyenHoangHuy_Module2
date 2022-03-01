package bai_tap_them_thay_chanh.quan_ly_phuong_tien_giao_thong.models;

import bai_tap_them_thay_chanh.quan_ly_phuong_tien_giao_thong.models.PhuongTienGiaoThong;

public class Oto extends PhuongTienGiaoThong {
    private int soChoNgoi;
    private String kieuXe ;

    public Oto() {
    }

    public Oto(int soChoNgoi, String kieuXe) {
        this.soChoNgoi = soChoNgoi;
        this.kieuXe = kieuXe;
    }

    public Oto(String bienKiemSoat, String tenHangSanXuat, String namSanXuat, String chuSoHuu, int soChoNgoi, String kieuXe) {
        super(bienKiemSoat, tenHangSanXuat, namSanXuat, chuSoHuu);
        this.soChoNgoi = soChoNgoi;
        this.kieuXe = kieuXe;
    }

    public int getSoChoNgoi() {
        return soChoNgoi;
    }

    public void setSoChoNgoi(int soChoNgoi) {
        this.soChoNgoi = soChoNgoi;
    }

    public String getKieuXe() {
        return kieuXe;
    }

    public void setKieuXe(String kieuXe) {
        this.kieuXe = kieuXe;
    }
}
