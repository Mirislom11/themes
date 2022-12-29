package io;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MoreExampleTwo {

    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("testout2.txt");
            String s = "";
            int i = fileReader.read();
            while (i != -1){
                s += (char) i;
               i = fileReader.read();;
            }
            fileReader.close();
            System.out.println(s);
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    /*try {
            File file = new File("testout2.txt");
            file.createNewFile();
            FileWriter fileWriter = new FileWriter(file);
            String s = "Hello my name is Islom";
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                fileWriter.write(c);
            }
            fileWriter.close();
        }catch (IOException e){
            e.printStackTrace();
        }*/
}
