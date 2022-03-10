package ss17_io_binary_file_va_serialization.bai_tap.model;

import java.util.Scanner;

public class Product {
    private int id;
    private String tenSanPham , hangSanXuat;
    private double giaTien;

    public Product() {
    }

    public Product(int id, String tenSanPham, String hangSanXuat, double giaTien) {
        this.id = id;
        this.tenSanPham = tenSanPham;
        this.hangSanXuat = hangSanXuat;
        this.giaTien = giaTien;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public String getHangSanXuat() {
        return hangSanXuat;
    }

    public void setHangSanXuat(String hangSanXuat) {
        this.hangSanXuat = hangSanXuat;
    }

    public double getGiaTien() {
        return giaTien;
    }

    public void setGiaTien(double giaTien) {
        this.giaTien = giaTien;
    }
    public void add(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập id :");
        id = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập tên sản phẩm :");
        tenSanPham = sc.nextLine();
        System.out.println("Nhập hãng sản xuất :");
        hangSanXuat = sc.nextLine();
        System.out.println("Nhập giá tiền : ");
        giaTien =Double.parseDouble(sc.nextLine());
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", tenSanPham='" + tenSanPham + '\'' +
                ", hangSanXuat='" + hangSanXuat + '\'' +
                ", giaTien=" + giaTien +
                '}';
    }
}
