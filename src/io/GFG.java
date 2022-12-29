package io;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class GFG {

    public static void main(String args[]) throws IOException {

       /* // create an abstract pathname (File object)
        File f = new File("D:\\program\\programm12");

        // check if the directory can be created
        // using the abstract path name
        if (f.mkdir()) {

            // display that the directory is created
            // as the function returned true
            System.out.println("Directory is created");
        }
        else {

            // display that the directory cannot be created
            // as the function returned false
            System.out.println("Directory cannot be created");
        }*/

        FileWriter fileWriter = new FileWriter("test1.txt");
        String s = "welcome to javaTPoint";
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        for (int i = 0; i < 10; i++) {
            bufferedWriter.write(s);
            bufferedWriter.newLine();
        }
        bufferedWriter.close();
        fileWriter.close();
    }
}
