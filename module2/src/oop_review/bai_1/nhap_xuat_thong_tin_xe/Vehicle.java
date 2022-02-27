package oop_review.bai_1.nhap_xuat_thong_tin_xe;

public class Vehicle {
    private int giaTriXe;
    private int dungTichXiLanh;

    public Vehicle() {
    }

    public Vehicle(int giaTriXe, int dungTichXiLanh) {
        this.giaTriXe = giaTriXe;
        this.dungTichXiLanh = dungTichXiLanh;
    }

    public int getGiaTriXe() {
        return giaTriXe;
    }

    public void setGiaTriXe(int giaTriXe) {
        this.giaTriXe = giaTriXe;
    }

    public int getDungTichXiLanh() {
        return dungTichXiLanh;
    }

    public void setDungTichXiLanh(int dungTichXiLanh) {
        this.dungTichXiLanh = dungTichXiLanh;
    }

    public double getTienThue() {
        if (this.getDungTichXiLanh() > 200) {
            return getGiaTriXe() * 0.05;
        } else if (this.getDungTichXiLanh() > 100) {
            return getGiaTriXe() * 0.03;
        } else {
            return getGiaTriXe() * 0.01;
        }
    }
    @Override
    public String toString(){
        return "Vehicle{" +
                "Giá trị xe =" + giaTriXe +
                ", Dung tích xi lanh xe=" + dungTichXiLanh +
                '}';
    }
}

