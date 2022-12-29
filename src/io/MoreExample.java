package io;

import java.io.*;

public class MoreExample {
    public static void main(String[] args) {
        /*try {
            FileOutputStream fout=new FileOutputStream("testout.txt");
            BufferedOutputStream bout=new BufferedOutputStream(fout);
            String s="Welcome to javaTpoint.";
            byte b[]=s.getBytes();
            bout.write(b);
            bout.flush();
            bout.close();
            fout.close();
            System.out.println("success");
        }catch (IOException e){
            e.printStackTrace();
        }*/
        /*try {
            FileInputStream fileInputStream = new FileInputStream("testout.txt");
            BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
            byte[] bytes = bufferedInputStream.readAllBytes();

        }catch (IOException e){
            e.printStackTrace();
        }*/
    }

    /*try {
            FileInputStream fileInputStream = new FileInputStream("testout.txt");
            StringBuilder stringBuilder = new StringBuilder();
            int i =  fileInputStream.read();

            while (i != -1){
                stringBuilder.append( i);
                i = fileInputStream.read();
            }
            fileInputStream.close();
            System.out.println(stringBuilder);
        }catch (IOException e){
            e.printStackTrace();
        }*/

    /*try {
            File file = new File("testout.txt");
            file.createNewFile();
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            for (int i = 0; i < 100; i++) {
                fileOutputStream.write(i);
            }
            fileOutputStream.flush();
            fileOutputStream.close();
        }catch (IOException e){
            e.printStackTrace();
        }*/
}
