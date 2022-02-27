package oop_review.bai_1.quan_li_tai_khoan_ngan_hang;

import java.util.Scanner;

public class Account {
    private long soTaiKhoan;
    private String tenTaiKhoan ;
    private  double soTienTK;
    private final double laiSuat = 0.035;


    public Account() {
    }

    public Account(long soTaiKhoan, String tenTaiKhoan, double soTienTK) {
        this.soTaiKhoan = soTaiKhoan;
        this.tenTaiKhoan = tenTaiKhoan;
        this.soTienTK = soTienTK;
    }

    public Account(long soTaiKhoan, String tenTaiKhoan) {
        this.soTaiKhoan = soTaiKhoan;
        this.tenTaiKhoan = tenTaiKhoan;
        this.soTienTK = 50;
    }

    public long getSoTaiKhoan() {
        return soTaiKhoan;
    }

    public void setSoTaiKhoan(long soTaiKhoan) {
        this.soTaiKhoan = soTaiKhoan;
    }

    public String getTenTaiKhoan() {
        return tenTaiKhoan;
    }

    public void setTenTaiKhoan(String tenTaiKhoan) {
        this.tenTaiKhoan = tenTaiKhoan;
    }

    public double getSoTienTK() {
        return soTienTK;
    }

    public void setSoTienTK(double soTienTK) {
        this.soTienTK = soTienTK;
    }

    @Override
    public String toString() {
        return "Account{" +
                "soTaiKhoan=" + soTaiKhoan +
                ", tenTaiKhoan='" + tenTaiKhoan + '\'' +
                ", soTienTK=" + soTienTK +
                '}';
    }
    public void napTien(){
        double soTienNapVao;
        System.out.println("Nhập số tiền bạn muốn nạp vào " + this.getTenTaiKhoan());
        Scanner scanner = new Scanner(System.in);
        soTienNapVao = Double.parseDouble(scanner.nextLine());
        if(soTienNapVao <= 0){
            System.out.println("Không hợp lệ , yêu cầu nhập lại ");
        }
        this.setSoTienTK(this.getSoTienTK()+soTienNapVao);
    }
    public void rutTien(){
        double soTienRutRa;
        System.out.println("Nhập số tiền bạn muốn rút ra " + this.getTenTaiKhoan());
        Scanner scanner = new Scanner(System.in);
        soTienRutRa = Double.parseDouble(scanner.nextLine());
        if(soTienRutRa <= 0){
            System.out.println("Không hợp lệ , yêu cầu nhập lại ");
        }
        this.setSoTienTK(this.getSoTienTK()- soTienRutRa);
    }
    public void daoHan(){
       this.setSoTienTK(this.getSoTienTK()+this.getSoTienTK()*laiSuat);
    }
    public void chuyenKhoan(Account account){
        double soTienMuonChuyen;
        System.out.println("Nhập số tiền muốn chuyển khoản :" + account.getTenTaiKhoan());
        Scanner scanner = new Scanner(System.in);
        soTienMuonChuyen =Double.parseDouble(scanner.nextLine());
        System.out.println(this.tenTaiKhoan + soTienMuonChuyen + " đến" + account.tenTaiKhoan);
        account.setSoTienTK(account.getSoTienTK()+soTienMuonChuyen);
        this.setSoTienTK(this.getSoTienTK()-soTienMuonChuyen);
    }
}
