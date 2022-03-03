package bai_tap_them_thay_chanh.quan_ly_phuong_tien_giao_thong.models;

public class HangSanXuat {
    String maHangSanXuat ;
    String tenHangSanXuat ;
    String tenQuocGia;

    public HangSanXuat() {
    }

    public HangSanXuat(String maHangSanXuat, String tenHangSanXuat, String tenQuocGia) {
        this.maHangSanXuat = maHangSanXuat;
        this.tenHangSanXuat = tenHangSanXuat;
        this.tenQuocGia = tenQuocGia;
    }

    public String getMaHangSanXuat() {
        return maHangSanXuat;
    }

    public void setMaHangSanXuat(String maHangSanXuat) {
        this.maHangSanXuat = maHangSanXuat;
    }

    public String getTenHangSanXuat() {
        return tenHangSanXuat;
    }

    public void setTenHangSanXuat(String tenHangSanXuat) {
        this.tenHangSanXuat = tenHangSanXuat;
    }

    public String getTenQuocGia() {
        return tenQuocGia;
    }

    public void setTenQuocGia(String tenQuocGia) {
        this.tenQuocGia = tenQuocGia;
    }
    public static HangSanXuat[] danhSachHangSanXuat(){
        HangSanXuat[] danhSachHangSanXuat = new HangSanXuat[5];
        HangSanXuat hang1 = new HangSanXuat("HSX-01","Lexus","Việt Nam");
        danhSachHangSanXuat[0] = hang1;
        HangSanXuat hang2 = new HangSanXuat("HSX-02","Lamborghini","Việt Nam");
        danhSachHangSanXuat[1] = hang2;
        HangSanXuat hang3 = new HangSanXuat("HSX-03","Ferrari","Việt Nam");
        danhSachHangSanXuat[2] = hang3;
        HangSanXuat hang4 = new HangSanXuat("HSX-04","Audi","Việt Nam");
        danhSachHangSanXuat[3] = hang4;
        HangSanXuat hang5 = new HangSanXuat("HSX-05","Range rover","Việt Nam");
        danhSachHangSanXuat[4] = hang5;
        return danhSachHangSanXuat;
    }

    @Override
    public String toString() {
        return "HangSanXuat{" +
                "maHangSanXuat='" + maHangSanXuat + '\'' +
                ", tenHangSanXuat='" + tenHangSanXuat + '\'' +
                ", tenQuocGia='" + tenQuocGia + '\'' +
                '}';
    }
}
