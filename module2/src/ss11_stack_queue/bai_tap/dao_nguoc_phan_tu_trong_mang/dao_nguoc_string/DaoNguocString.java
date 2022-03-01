package ss11_stack_queue.bai_tap.dao_nguoc_phan_tu_trong_mang.dao_nguoc_string;


import java.util.Stack;

public class DaoNguocString {
    public static void main(String[] args) {
        Stack<Character>characterStack =new Stack<>();
        String str = "Nguyễn Hoàng Huy";
        for (int i = 0 ; i < str.length() ; i++){
            characterStack.push(str.charAt(i));
        }
        String result = "";
        for (int i = 0 ; i < str.length() ; i++){
            result += characterStack.pop();
        }
        System.out.println(result);
    }
}
