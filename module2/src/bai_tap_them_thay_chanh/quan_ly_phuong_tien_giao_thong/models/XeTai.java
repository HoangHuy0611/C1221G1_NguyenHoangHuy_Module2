package bai_tap_them_thay_chanh.quan_ly_phuong_tien_giao_thong.models;

import bai_tap_them_thay_chanh.quan_ly_phuong_tien_giao_thong.models.PhuongTienGiaoThong;

public class XeTai extends PhuongTienGiaoThong {
    private int trongTai;

    public XeTai() {
    }

    public XeTai(int trongTai) {
        this.trongTai = trongTai;
    }

    public XeTai(String bienKiemSoat, String tenHangSanXuat, String namSanXuat, String chuSoHuu, int trongTai) {
        super(bienKiemSoat, tenHangSanXuat, namSanXuat, chuSoHuu);
        this.trongTai = trongTai;
    }

    public int getTrongTai() {
        return trongTai;
    }

    public void setTrongTai(int trongTai) {
        this.trongTai = trongTai;
    }
}
