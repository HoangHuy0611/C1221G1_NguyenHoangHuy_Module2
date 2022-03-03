package bai_tap_them_thay_chanh.quan_ly_phuong_tien_giao_thong.controllers;

import bai_tap_them_thay_chanh.quan_ly_phuong_tien_giao_thong.services.ImpOto;
import bai_tap_them_thay_chanh.quan_ly_phuong_tien_giao_thong.services.ImpXeMay;
import bai_tap_them_thay_chanh.quan_ly_phuong_tien_giao_thong.services.ImpXeTai;

import java.util.Scanner;

public class Main {
    public static ImpOto danhSachOto = new ImpOto();
    public static ImpXeTai danhSachXeTai = new ImpXeTai();
    public static ImpXeMay danhSachXeMay = new ImpXeMay();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = -1;
        while (true) {
            System.out.println("-----CHƯƠNG TRÌNH QUẢN LÝ PHƯƠNG TIỆN GIAO THÔNG----- ");
            System.out.println("Chọn chức năng :");
            System.out.println("1.Thêm mới phương tiện");
            System.out.println("2.Hiển thị phương tiện");
            System.out.println("3.Xóa phương tiện ");
            System.out.println("4.Thoát");
            System.out.println("Nhập chức năng muốn chọn :");
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("Thêm mới phương tiện");
                    do {
                        System.out.println("1.thêm xe ô tô");
                        System.out.println("2.thêm xe xe tải");
                        System.out.println("3.thêm xe xe máy");
                        choice = Integer.parseInt(sc.nextLine());
                    } while (choice > 3);

                    switch (choice) {
                        case 1:
                            System.out.println("Bạn muốn thêm xe ô tô");
                            danhSachOto.add();
                            break;
                        case 2:
                            System.out.println("Bạn muốn thêm xe tải");
                            danhSachXeTai.add();
                            break;
                        case 3:
                            System.out.println("Bạn muốn thêm xe máy ");
                            danhSachXeMay.add();
                            break;
                    }
                    break;
                case 2:
                    System.out.println("Hiển thị  phương tiện");
                    do {
                        System.out.println("1.Hiển thị danh sách ô tô");
                        System.out.println("2.Hiển thị danh sách  xe tải");
                        System.out.println("3.Hiển thị danh sách  xe máy");
                        choice = Integer.parseInt(sc.nextLine());
                    } while (choice > 3);
                    switch (choice) {
                        case 1:
                            System.out.println("Bạn hiển thị danh sách xe ô tô");
                            danhSachOto.display();
                            break;
                        case 2:
                            System.out.println("Bạn hiển thị danh sách xe tải");
                            danhSachXeTai.display();
                            break;
                        case 3:
                            System.out.println("Bạn hiển thị danh sách xe máy ");
                            danhSachXeMay.display();
                            break;
                    }
                    break;
                case 3:
                    System.out.println("Nhập biển kiểm soát của phương tiện muốn xóa");
                    String bienKiemSoat = sc.nextLine();
                    danhSachOto.delete(bienKiemSoat);
                    danhSachXeTai.delete(bienKiemSoat);
                    danhSachXeMay.delete(bienKiemSoat);
                    break;
                case 4:
                    System.exit(4);
            }
        }
    }
}


