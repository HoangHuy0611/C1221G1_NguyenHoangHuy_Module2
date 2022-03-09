package ss16_io_text_file.bai_tap.copy_file;

import java.io.*;

public class CopyFile {
    public static void copyFile() {
        File sourceFile = new File("D:\\TailieuhocIT\\codegym\\module 2\\module2\\src\\ss16_io_text_file\\bai_tap\\copy_file\\SourceFile.txt");
        File targetFile = new File("D:\\TailieuhocIT\\codegym\\module 2\\module2\\src\\ss16_io_text_file\\bai_tap\\copy_file\\TargetFile.txt");
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;
        try {
            fileInputStream = new FileInputStream(sourceFile);
            fileOutputStream = new FileOutputStream(targetFile);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            System.out.println(fileInputStream.available());
        } catch (IOException e) {
            e.printStackTrace();
        }
        int i = 0;
        try {
            while ((i = fileInputStream.read()) != -1) {
                fileOutputStream.write(i);
            }
        } catch (IOException e) {
            e.printStackTrace();

        } finally {
            if (fileInputStream != null) {
                try {
                    fileOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }
    }

    public static void main(String[] args) {
        copyFile();
    }
}
