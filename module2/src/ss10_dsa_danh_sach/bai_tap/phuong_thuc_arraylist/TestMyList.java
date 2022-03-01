package ss10_dsa_danh_sach.bai_tap.phuong_thuc_arraylist;

import java.util.Arrays;

public class TestMyList {
    public static void main(String[] args) {
        MyList<Integer> listInteger = new MyList<>();

        listInteger.add(0, 1);
        listInteger.add(1, 2);
        listInteger.add(2, 3);
        listInteger.add(3, 4);
        listInteger.remove(2);
        for (int i = 0; i < listInteger.getSize(); i++) {
            System.out.println(listInteger.get(i));
        }
    }
}
