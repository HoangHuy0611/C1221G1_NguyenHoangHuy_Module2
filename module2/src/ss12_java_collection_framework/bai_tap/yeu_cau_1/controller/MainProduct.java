package ss12_java_collection_framework.bai_tap.yeu_cau_1.controller;

import ss12_java_collection_framework.bai_tap.yeu_cau_1.services.ProductManager;

import java.util.Scanner;

public class MainProduct {
    public static ProductManager productManager = new ProductManager();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int chooseMenu;
        boolean flag = true;
        do {
            System.out.println("Quản lý sản phẩm: \n" +
                    "1. Thêm sản phẩm \n" +
                    "2. Sửa thông tin sản phẩm \n" +
                    "3. Xóa sản phẩm theo id \n" +
                    "4. Hiển thị danh sách  sản phẩm \n" +
                    "5. Tìm kiếm  sản phẩm \n" +
                    "6. Sắp xếp  sản phẩm \n");
            System.out.println("Chọn chức năng :");
            chooseMenu = Integer.parseInt(sc.nextLine());
            switch (chooseMenu) {
                case 1:
                    productManager.add();
                    System.out.println("Thêm sản phẩm thành công \n");
                    break;
                case 2:
                    System.out.println("Nhập số ID sản phẩm bạn muốn sửa :");
                    int editId = sc.nextInt();
                    productManager.edit(editId);
                    System.out.println("Sửa id sản phẩm thành công \n");
                    break;
                case 3:
                    System.out.println("Nhập số ID sản phẩm bạn muốn xóa :");
                    int deleteID = sc.nextInt();
                    productManager.edit(deleteID);
                    System.out.println("Xóa id sản phẩm thành công \n");
                    break;
                case 4:
                    productManager.display();
                    System.out.println("Hiển thị sản phẩm ");
                case 5:
                    System.out.println("Nhập tên sản phẩm bạn muốn tìm :");
                    String searchTenSanPham = sc.nextLine();
                    productManager.search(searchTenSanPham);
                    System.out.println("Sản phẩm bạn muốn tìm  \n");
                    break;
                case 6:
                    System.out.println("Sắp xếp theo giá tiền giảm dần ");
                    productManager.sort();
                    productManager.display();
                    System.out.println("Sắp xếp theo giá tiền tăng dần ");
                    productManager.sort1();
                    productManager.display();
                    break;
            }

        } while (flag);
    }
}
