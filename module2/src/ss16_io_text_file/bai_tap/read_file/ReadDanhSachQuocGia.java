package ss16_io_text_file.bai_tap.read_file;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadDanhSachQuocGia {
    public static List<DanhSachQuocGia>readDanhSachQuocGia(String filePath){
        List<DanhSachQuocGia>danhSachQuocGia = new ArrayList<>();
        File file = new File(filePath);
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = "";
            String[] array = null;
            while ((line = bufferedReader.readLine()) != null){
                array =line.split(",");
                DanhSachQuocGia danhSachQuocGia1= new DanhSachQuocGia(Integer.parseInt(array[0]),array[1],array[2]);
                danhSachQuocGia.add(danhSachQuocGia1);
            }
        } catch (IOException e) {
            System.err.println("Read file error.");
        }
        return danhSachQuocGia;
    }

    public static void main(String[] args) {
        List<DanhSachQuocGia> danhSachQuocGia =readDanhSachQuocGia("D:\\TailieuhocIT\\codegym\\module 2\\module2\\src\\ss16_io_text_file\\bai_tap\\read_file\\DanhSachQuocGia.csv");
        for (DanhSachQuocGia danhSachQuocGia1 : danhSachQuocGia){
            System.out.println(danhSachQuocGia1);
        }
    }
}
