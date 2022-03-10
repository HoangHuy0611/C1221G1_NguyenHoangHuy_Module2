package ss17_io_binary_file_va_serialization.bai_tap.service;

import ss17_io_binary_file_va_serialization.bai_tap.model.Product;
import sun.security.rsa.RSAUtil;

import java.util.ArrayList;
import java.util.Scanner;

public class ServiceProduct implements Service {
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
        System.out.println("Hiển thị danh sách sản phẩm ");
        for (Product product : productList){
            System.out.println(product);
        }
    }

    @Override
    public void search(String tenSanPham) {
        ArrayList<Product> searchProduct =new ArrayList<>();
        for (Product product : productList){
            if(product.getTenSanPham().contains(tenSanPham)){
                searchProduct.add(product);
            }
        }
        System.out.println("Sản phẩm tìm kiếm :");
        for (Product product :searchProduct){
            System.out.println("mã sản phẩm " + product.getId());
            System.out.println("tên sản phẩm " + product.getTenSanPham());
            System.out.println("hãng sản xuất " + product.getHangSanXuat());
            System.out.println("giá tiền của sản phẩm " +product.getGiaTien());
        }
    }
}
