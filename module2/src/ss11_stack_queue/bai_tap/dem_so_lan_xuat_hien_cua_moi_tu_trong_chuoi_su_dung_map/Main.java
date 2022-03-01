package ss11_stack_queue.bai_tap.dem_so_lan_xuat_hien_cua_moi_tu_trong_chuoi_su_dung_map;

import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        String str = "Nguyen Hoang Huy Huy";

        Map<String, Integer> stringMap = new TreeMap<>();
        String[] strList = str.split(" ");
        for(int i = 0 ; i<strList.length ;i++){
            strList[i] = strList[i].toLowerCase();
        }
        for (String word : strList) {
            if (!stringMap.containsKey(word)) {
                stringMap.put(word, 1);
            } else {
                stringMap.replace(word, stringMap.get(word) + 1);
            }
        }
        System.out.println(stringMap);
    }
}
