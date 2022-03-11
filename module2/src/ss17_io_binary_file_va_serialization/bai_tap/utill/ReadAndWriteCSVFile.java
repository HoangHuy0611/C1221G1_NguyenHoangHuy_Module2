package ss17_io_binary_file_va_serialization.bai_tap.utill;

import ss17_io_binary_file_va_serialization.bai_tap.model.Product;


import java.io.*;
import java.util.ArrayList;
import java.util.List;

import static ss17_io_binary_file_va_serialization.bai_tap.service.ServiceProduct.productList;

public class ReadAndWriteCSVFile {
    public static List<Product> writeObjectProductList(String filePath) {
        File file = new File(filePath);
        FileOutputStream fileOutputStream = null;
        ObjectOutputStream objectOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream(file);
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(productList);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (objectOutputStream != null) {
                    objectOutputStream.close();
                    fileOutputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    public static List<Product> readObjectProductList(String filePath) {
        List<Product> productList1 = new ArrayList<>();
        File file = new File(filePath);
        FileInputStream fileInputStream = null;
        ObjectInputStream objectInputStream = null;
        try {
            fileInputStream = new FileInputStream(file);
            objectInputStream = new ObjectInputStream(fileInputStream);
            productList1 = (List<Product>) objectInputStream.readObject();
        } catch (IOException e) {
            e.printStackTrace();
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        } finally {
            try {
                if (objectInputStream != null) {
                    objectInputStream.close();
                    fileInputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            return productList1;
        }
    }
}
