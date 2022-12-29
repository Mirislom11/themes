package io;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamExample {
    public static void main(String[] args) {
        try {
            FileInputStream fileInputStream1 = new FileInputStream("stoage1.txt");
            byte [] bytes = fileInputStream1.readAllBytes();

            for (byte aByte : bytes) {
                System.out.print((char) aByte);
            }
            fileInputStream1.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
