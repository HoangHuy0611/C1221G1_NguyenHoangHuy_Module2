package ss3_mang_va_phuong_thuc_java.thuc_hanh;
import java.util.Scanner;
public class DaoNguocCacPhanTuCuaMang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;
        do {
            System.out.print("Enter a size: ");
            size = sc.nextInt();
            if (size > 20) {
                System.out.println("Size does not exceed 20");
            }
        } while (size > 20);
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Nhập phần tử trong mảng " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Mảng : ");
        for (int i : arr) {
            System.out.print(i + "\t");
        }
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }
        System.out.println("\nMảng sau khi đảo ngược: ");
        for (int i : arr) {
            System.out.print(i + "\t");
        }
    }
}
