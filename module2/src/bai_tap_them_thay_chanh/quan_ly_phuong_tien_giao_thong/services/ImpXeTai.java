package bai_tap_them_thay_chanh.quan_ly_phuong_tien_giao_thong.services;


import bai_tap_them_thay_chanh.quan_ly_phuong_tien_giao_thong.models.HangSanXuat;
import bai_tap_them_thay_chanh.quan_ly_phuong_tien_giao_thong.models.Oto;
import bai_tap_them_thay_chanh.quan_ly_phuong_tien_giao_thong.models.XeTai;

import java.util.ArrayList;
import java.util.Scanner;

public class ImpXeTai implements ChucNang {
    public static ArrayList<XeTai> danhSachXeTai = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    @Override
    public void add() {
        System.out.println("Nhập biển kiểm soát");
        String bienKiemSoat = sc.nextLine();
        for (int i = 0; i < HangSanXuat.danhSachHangSanXuat().length; i++) {
            System.out.println((i + 1) + "" + HangSanXuat.danhSachHangSanXuat()[i].getTenHangSanXuat());
        }
        System.out.println("Chọn hãng sản xuất");
        int choose = Integer.parseInt(sc.nextLine());
        String hangSanXuat = HangSanXuat.danhSachHangSanXuat()[--choose].getTenHangSanXuat();
        System.out.println("Nhập năm sản xuất ");
        int namSanXuat = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập tên chủ sở hữu");
        String chuSoHuu = sc.nextLine();
        System.out.println("Nhập tải trọng của xe ");
        int trongTai = Integer.parseInt(sc.nextLine());
        XeTai xeTai = new XeTai(bienKiemSoat, hangSanXuat, namSanXuat, chuSoHuu, trongTai);
        danhSachXeTai.add(xeTai);
    }

    @Override
    public void display() {
        System.out.println("Hiển thị danh sách xe tải");
        for (XeTai element : danhSachXeTai) {
            System.out.println(element);

        }
    }

    @Override
    public void delete(String bienKiemSoat) {
        for (int i = 0; i < danhSachXeTai.size(); i++) {

            if (bienKiemSoat.equals(danhSachXeTai.get(i).getBienKiemSoat())) {
                System.out.println("Yes or no");
                String choose = sc.nextLine();
                if (choose.equals("yes")) {
                    danhSachXeTai.remove(danhSachXeTai.get(i));
                    System.out.println("Đã xóa");
                    break;
                } else if (choose.equals("no")) {
                    System.out.println("Không xóa");
                    break;
                }


            }
        }
    }

    @Override
    public void exit() {
        System.exit(4);
    }
}
