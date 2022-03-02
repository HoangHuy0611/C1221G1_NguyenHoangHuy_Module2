package ss12_java_collection_framework.bai_tap.yeu_cau_1.services;

import ss12_java_collection_framework.bai_tap.yeu_cau_1.models.Product;
import ss12_java_collection_framework.bai_tap.yeu_cau_1.models.SortPriceDown;
import ss12_java_collection_framework.bai_tap.yeu_cau_1.models.SortPriceUp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ProductManager implements IManager {
    public static ArrayList<Product> productArrayList = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    @Override
    public void add() {
        System.out.println("Nhập id :");
        int id = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập tên sản phẩm :");
        String tenSanPham = sc.nextLine();
        System.out.println("Nhập giá của sản phẩm :");
        double price = Double.parseDouble(sc.nextLine());
        productArrayList.add(new Product(id, tenSanPham, price));

    }

    @Override
    public void edit(int id) {
        for (Product productManager : productArrayList) {
            if (productManager.getId() == id) {
                System.out.println(productManager);
                System.out.println("Edit thông tin sản phẩm ");
                System.out.println("Edit id" + productManager.getId());
                System.out.println("New id");
                int newId = Integer.parseInt(sc.nextLine());
                productManager.setId(newId);
                System.out.println("Edit tên sản phảm:" + productManager.getTenSanPham());
                System.out.println("New sản phẩm:");
                String newSanPham = sc.nextLine();
                productManager.setTenSanPham(newSanPham);
                System.out.println("Edit giá sản phẩm" + productManager.getPrice());
                System.out.println("New price :");
                double newPrice = sc.nextDouble();
                productManager.setPrice(newPrice);
            }
        }
    }

    @Override
    public void delete(int id) {
        boolean check = true;
        for (Product product : productArrayList) {
            if (product.getId() == id) {
                productArrayList.remove(product);
                check = false;
                break;
            }

        }
    }

    @Override
    public void display() {
    int count = 0;
    for (Product product :productArrayList){
        System.out.println("Sản phẩm :" + (++count));
        System.out.println("id" + product.getId());
        System.out.println("Tên sản phẩm" + product.getTenSanPham());
        System.out.println("Price" + product.getPrice());

    }
    }

    @Override
    public void search(String tenSanPham) {
        ArrayList<Product> searchProduct = new ArrayList<>();
        for (Product product: productArrayList) {
            if (product.getTenSanPham().contains(tenSanPham)){
                searchProduct.add(product);
            }
        }
        System.out.println("Sản phẩm tìm kiếm :");
        for (Product product: searchProduct) {
            System.out.println("id :" + product.getId());
            System.out.println("Tên sản phẩm" + product.getTenSanPham());
            System.out.println("Price" + product.getPrice());

        }
    }

    @Override
    public void sort() {
        Collections.sort(productArrayList , new SortPriceDown());

    }
    @Override
    public void sort1() {
        Collections.sort(productArrayList , new SortPriceUp());

    }

}
