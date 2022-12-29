package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class FileOutputStreamExample {

    public static void main(String[] args) {
        try {
            File file =new File("storage.txt");
            File file1 = new File("stoage1.txt");
            file.createNewFile();
            file1.createNewFile();
            FileOutputStream fileOutputStreamOne = new FileOutputStream(file);
            FileOutputStream fileOutputStreamTwo = new FileOutputStream(file1);
            String line = "Now is the tirne for all good rnen\n"
                    + " to соте to the aid of their country\n"
                    + " and рау their due taxes.";

            byte []bytes = line.getBytes(StandardCharsets.UTF_8);
            /*for (byte aByte : bytes) {
                System.out.println(aByte);
            }*/
            fileOutputStreamOne.write(bytes);

            for (int i =0; i< bytes.length; i +=2){
                fileOutputStreamTwo.write(bytes[i]);
            }
            fileOutputStreamOne.close();
            fileOutputStreamTwo.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
