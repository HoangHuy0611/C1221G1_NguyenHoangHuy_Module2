package ss3_mang_va_phuong_thuc_java.bai_tap;

import java.util.Scanner;
import java.util.Arrays;

public class ThemPhanTuVaoMang {
    public static void main(String[] args) {
        int[] arr = {3, 4, 6, 7, 1, 9};
        System.out.println("My array: " + Arrays.toString(arr));
        Scanner sc = new Scanner(System.in);
        System.out.print("Add new element at index: ");
        int newElementIndex = sc.nextInt();
        System.out.print("Element value: ");
        int newElementValue = sc.nextInt();
        if (newElementIndex < arr.length) {
            int[] newArr = new int[arr.length + 1];
            for (int i = 0, j = 0; i < arr.length; i++, j++) {
                if (i == newElementIndex) {
                    j++;
                }
                newArr[j] = arr[i];
            }
            newArr[newElementIndex] = newElementValue;
            System.out.println("My new array: " + Arrays.toString(newArr));
        }
    }
}
