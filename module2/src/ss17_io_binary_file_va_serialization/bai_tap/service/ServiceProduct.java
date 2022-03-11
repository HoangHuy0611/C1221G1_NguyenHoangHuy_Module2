package ss17_io_binary_file_va_serialization.bai_tap.service;

import ss17_io_binary_file_va_serialization.bai_tap.model.Product;
import ss17_io_binary_file_va_serialization.bai_tap.utill.ReadAndWriteCSVFile;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ServiceProduct implements Service {
    private static final String PRODUCT_FILE = "D:\\TailieuhocIT\\codegym\\module 2\\module2\\src\\ss17_io_binary_file_va_serialization\\bai_tap\\data\\Product.csv";
    public static ArrayList<Product> productList = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    @Override
    public void add() {
        System.out.println("Nhập mã sản phẩm :");
        int id = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập tên sản phẩm :");
        String tenSanPham = sc.nextLine();
        System.out.println("Nhập hãng sản xuất :");
        String hangSanXuat = sc.nextLine();
        System.out.println("Nhập giá sản phẩm :");
        Double giaTien = Double.parseDouble(sc.nextLine());
        Product product = new Product(id, tenSanPham, hangSanXuat, giaTien);
        productList.add(product);

    }

    @Override
    public void display() {
        List<Product> productList = ReadAndWriteCSVFile.readObjectProductList(PRODUCT_FILE);
        System.out.println("Hiển thị danh sách sản phẩm ");
        for (Product product : productList) {
            System.out.println(product);
        }
    }

    @Override
    public void search() {
        Scanner sc = new Scanner(System.in);
        List<Product> productList = ReadAndWriteCSVFile.readObjectProductList(PRODUCT_FILE);
        System.out.print("Nhập tên sản phẩm bạn muốn tìm: ");
        String timTenSanPham = sc.nextLine();
        System.out.println("Sản phẩm bạn muốn tìm: ");
        for (Product product : productList) {
            if (product.getTenSanPham().contains(timTenSanPham)) {
                System.out.println(product);
            }
        }
    }
}
