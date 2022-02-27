package oop_review.bai_1.quan_li_tai_khoan_ngan_hang;

public class Main {
    public static void main(String[] args) {
        Account account1 = new Account(8888,"hoang",300000);
        Account account2 = new Account(9999, "huy",500000);
        account1.napTien();
        account1.rutTien();
        account1.daoHan();
        account1.chuyenKhoan(account2);
        System.out.println(account1);
        System.out.println(account2);
    }
}
