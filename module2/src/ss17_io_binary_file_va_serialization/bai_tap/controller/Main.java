package ss17_io_binary_file_va_serialization.bai_tap.controller;

import ss17_io_binary_file_va_serialization.bai_tap.service.ServiceProduct;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    }

    public static void showMenu() {
        ServiceProduct serviceProduct = new ServiceProduct();
        Scanner scanner = new Scanner(System.in);
        int choose;
        boolean flag = true;
        do {
            System.out.println("1.Thêm sản phẩm ");
            System.out.println("2.Hiển thị sản phẩm ");
            System.out.println("3.Tìm kiếm  sản phẩm ");
            System.out.println("Chọn");
            choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    serviceProduct.add();
                    break;
                case 2:
                    serviceProduct.display();
                    break;
                case 3:
                    serviceProduct.search();
                    break;
                default:
                    System.out.println("Thử lại !");
            }
        } while (flag);

    }

}
