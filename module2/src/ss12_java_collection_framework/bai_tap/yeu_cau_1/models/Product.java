package ss12_java_collection_framework.bai_tap.yeu_cau_1.models;

public  class Product {
    private int id ;
    private String tenSanPham;
    private double price;

    public Product() {
    }

    public Product(int id, String tenSanPham, double price) {
        this.id = id;
        this.tenSanPham = tenSanPham;
        this.price = price;
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
