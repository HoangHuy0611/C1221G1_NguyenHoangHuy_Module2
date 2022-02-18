package ss3_mang_va_phuong_thuc_java.bai_tap;
import java.util.Scanner;
import java.util.Arrays;
public class XoaPhanTuKhoiMang {
    public static void main(String[] args) {
    int[] arr = {3,4,6,7,1,9};
    Scanner sc =new Scanner(System.in);
        int input = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (input == arr[i]) {
                for (int j = i; j < arr.length - 1; j++) {
                    arr[j] = arr[j + 1];
                }
                arr[arr.length - 1] = 0;
                i--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

}
