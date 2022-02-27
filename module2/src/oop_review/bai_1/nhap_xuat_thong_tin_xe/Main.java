package oop_review.bai_1.nhap_xuat_thong_tin_xe;


import java.util.Scanner;

public class Main {
    private static final int NHAP = 1;
    private static final int XUAT = 2;
    private static final int THOAT = 3;

    public static void main(String[] args) {
        int choice = 0;
        Vehicle[] vehicles = new Vehicle[10];
        Scanner input = new Scanner(System.in);
        do {
            choice = getChoice(input);

            switch (choice) {
                case NHAP:
                    nhapThongTinXe(vehicles, input);
                    break;
                case XUAT:
                    xuatThueXe(vehicles);
                    break;
                case THOAT:
                    System.exit(0);
            }
        } while (choice != 3);
    }

    private static void nhapThongTinXe(Vehicle[] vehicles, Scanner input) {
        System.out.println("nhập giá trị xe ");
        int giaTriXe = Integer.parseInt(input.nextLine());
        System.out.println("nhập dung tích xi lanh xe ");
        int dungTichXiLanh = Integer.parseInt(input.nextLine());
        Vehicle vehicle = new Vehicle(giaTriXe, dungTichXiLanh);
        for (int i = 0; i < vehicles.length; i++) {
            if (vehicles[i] == null) {
                vehicles[i] = vehicle;
                break;
            }
        }
    }

    private static void xuatThueXe(Vehicle[] vehicles) {
        System.out.println("tiền thuế của xe ");
        for (Vehicle elementVehicle : vehicles) {
            if (elementVehicle != null) {
                System.out.println("Tiền thuế của xe là : " + elementVehicle.getTienThue() + "VND");
            }
        }
    }

    private static int getChoice(Scanner input) {
        int choice;
        System.out.println("1.\tTạo các đối tượng xe và nhập thông tin");
        System.out.println("2.\tXuất bảng kê khai tiền thuế của các xe");
        System.out.println("3.\tThoát");
        System.out.println("nhập lựa chọn");
        choice = Integer.parseInt(input.nextLine());
        return choice;
    }
}

