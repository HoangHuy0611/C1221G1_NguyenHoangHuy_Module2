package ss11_stack_queue.bai_tap.dao_nguoc_phan_tu_trong_mang.dao_nguoc_element;

import java.util.Stack;

public class DaoNguocElement {
    public static void main(String[] args) {
        Stack<Integer>integerStack = new Stack<>();
        int [] arrays = {1,2,3,4,5};
       for (int i = 0 ; i < arrays.length ; i++){
           integerStack.push(arrays[i]);
       }
        for (int i = 0 ; i < arrays.length ; i++){
            arrays[i] = integerStack.pop();
        }
        for (int i = 0 ; i < arrays.length ; i++){
            integerStack.push(arrays[i]);
        }
        System.out.println(integerStack);
    }
}
