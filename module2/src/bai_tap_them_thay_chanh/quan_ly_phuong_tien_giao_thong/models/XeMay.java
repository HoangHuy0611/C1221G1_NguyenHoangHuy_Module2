package bai_tap_them_thay_chanh.quan_ly_phuong_tien_giao_thong.models;

import bai_tap_them_thay_chanh.quan_ly_phuong_tien_giao_thong.models.PhuongTienGiaoThong;

public class XeMay extends PhuongTienGiaoThong {
    private int congSuat;

    public XeMay() {
    }

    public XeMay(int congSuat) {
        this.congSuat = congSuat;
    }

    public XeMay(String bienKiemSoat, String tenHangSanXuat, String namSanXuat, String chuSoHuu, int congSuat) {
        super(bienKiemSoat, tenHangSanXuat, namSanXuat, chuSoHuu);
        this.congSuat = congSuat;
    }

    public int getCongSuat() {
        return congSuat;
    }

    public void setCongSuat(int congSuat) {
        this.congSuat = congSuat;
    }
}
