package bai_tap_them_thay_chanh.quan_ly_phuong_tien_giao_thong.services;

import bai_tap_them_thay_chanh.quan_ly_phuong_tien_giao_thong.models.HangSanXuat;
import bai_tap_them_thay_chanh.quan_ly_phuong_tien_giao_thong.models.Oto;
import bai_tap_them_thay_chanh.quan_ly_phuong_tien_giao_thong.models.Vehicle;

import java.util.ArrayList;
import java.util.Scanner;

public class ImpOto implements ChucNang {
    public static ArrayList<Oto> danhSachOto = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    @Override
    public void add() {
        System.out.println("Nhập biển kiểm soát");
        String bienKiemSoat = sc.nextLine();
        for(int i = 0 ; i < HangSanXuat.danhSachHangSanXuat().length;i++){
            System.out.println((i+1) + "" + HangSanXuat.danhSachHangSanXuat()[i].getTenHangSanXuat());
        }
        System.out.println("Chọn hãng sản xuất");
        int choose = Integer.parseInt(sc.nextLine());
        String hangSanXuat = HangSanXuat.danhSachHangSanXuat()[--choose].getTenHangSanXuat();
        System.out.println("Nhập năm sản xuất ");
        int namSanXuat = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập tên chủ sở hữu");
        String chuSoHuu = sc.nextLine();
        System.out.println("Nhập số chỗ ngồi");
        int soChoNgoi = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập kiểu xe ");
        for (int i = 0; i < kieuXe().length; i++) {
            System.out.println((i + 1) + " " + kieuXe()[i]);
        }
        choose = Integer.parseInt(sc.nextLine());
        String kieuXe = kieuXe()[--choose];

        Oto oto = new Oto(bienKiemSoat,hangSanXuat, namSanXuat, chuSoHuu, soChoNgoi, kieuXe);
        danhSachOto.add(oto);

    }
    public static String[] kieuXe() {
        String[] kieuXe = new String[2];
        kieuXe[0] = "Du lịch";
        kieuXe[1] = "Xe khách";
        return kieuXe;
    }

    @Override
    public void display() {
        System.out.println("Hiển thị danh sách ô tô");
        for (Oto element : danhSachOto) {
            System.out.println(element);

        }
    }

    @Override
    public void delete(String bienKiemSoat) {
        for (int i = 0; i < danhSachOto.size(); i++) {

            if (bienKiemSoat.equals(danhSachOto.get(i).getBienKiemSoat())){
                System.out.println("Yes or no");
                String choose = sc.nextLine();
                if (choose.equals("yes")){
                    danhSachOto.remove(danhSachOto.get(i));
                    System.out.println("Đã xóa");
                    break;
                }else if(choose.equals("no")){
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
