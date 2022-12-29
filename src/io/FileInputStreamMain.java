package io;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;
import java.util.Random;

public class FileInputStreamMain {
    public static void main(String[] args) throws IOException {

/*            int k = fileInputStream.read();

            while ( k!= -1 ){
                if ((char) k == ' ') {
                    System.out.println();
                }
                System.out.print((char) k);
                k = fileInputStream.read();
            }*/
/*            byte [] chars = new byte[fileInputStream.available()];
            fileInputStream.read(chars);

            for (byte aChar : chars) {
                System.out.println((char) aChar);
            }
        }catch (IOException ex) {
            System.out.println("File Not Found");
        }
        PrintStream printStream =  new PrintStream("Islom.txt");
        printStream.println("Privet");
        Random random = new Random();
        byte [] bytes = new byte[20];
        random.nextBytes(bytes);

        for (byte aByte : bytes) {
            System.out.println(aByte);
        }*/

        URL url = new URL("https://dasturlash.uz/lesson/java/article/2b34908a-6285-11ec-8d0c-e83935115a22");
        /*System.out.println(url.getQuery());*/
        URLConnection urlConnection = url.openConnection();
        System.out.println(urlConnection.getContent());
    }
}
