package ss14_thuat_toan_sap_xep.bai_tap.minh_hoa_insertion_sort;

public class InsertionSort {
    static int[] array = {2, 3, 12, 13, 1, 4, 10};

    public static void insertionSort(int[] array) {
        int pos, x;
        for (int i = 1; i < array.length; i++) {
            x = array[i];
            pos = i;
            while (pos > 0 && x < array[pos - 1]) {
                System.out.println("Swap " + array[pos] + " of index " + pos + " with " + array[pos - 1] + " of index " + (pos - 1));
                array[pos] = array[pos - 1];
                pos--;
            }
            array[pos] = x;
            System.out.print("List after the  " + i + "' sort: ");
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[j] + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.print("Your input list: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
        System.out.println("\nBegin sort processing...");
        insertionSort(array);
    }
}
