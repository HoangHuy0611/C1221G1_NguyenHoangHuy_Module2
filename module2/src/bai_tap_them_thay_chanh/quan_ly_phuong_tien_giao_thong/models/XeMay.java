package bai_tap_them_thay_chanh.quan_ly_phuong_tien_giao_thong.models;

public class XeMay extends Vehicle{
    private int congSuat;

    public XeMay() {
    }

    public XeMay(int congSuat) {
        this.congSuat = congSuat;
    }

    public XeMay(String bienKiemSoat, String hangSanXuat, int namSanXuat, String chuSoHuu, int congSuat) {
        super(bienKiemSoat, hangSanXuat, namSanXuat, chuSoHuu);
        this.congSuat = congSuat;
    }

    public int getCongSuat() {
        return congSuat;
    }

    public void setCongSuat(int congSuat) {
        this.congSuat = congSuat;
    }

    @Override
    public String toString() {
        return "XeMay{" +
                "congSuat=" + congSuat +
                '}'+ super.toString();
    }
}
