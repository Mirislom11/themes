import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class FileMain {
    public static void main(String[] args) throws IOException {
/*        File file  = new File("Student.txt");
        FileReader fileReader = new FileReader(file);
        int n= fileReader.read();
        while (n != -1) {
            System.out.print((char)n);
            n= fileReader.read();
        }
        int m = fileReader.read();
        char [] s = new char[(int) file.length()];
        int k = 0;
        while (m != -1){
            System.out.println(fileReader.read(s));
            k = fileReader.read();
            m = fileReader.read();
        }
        for (char c : s) {
            System.out.println(c);
        }
        System.out.println(k);
         fileReader.close();*/

       /* File file = new File("Student.txt");*/

        // Создание файла
       /* file.createNewFile();*/

        // Создание объекта FileWriter
        /*FileWriter writer = new FileWriter(file);*/

        // Запись содержимого в файл
        /*writer.write("Это простой пример,\n в котором мы осуществляем\n с помощью языка Java\n запись в файл\n и чтение из файла\n");
        writer.flush();
        writer.close();*/

        // Создание объекта FileReader
       /* FileReader fr = new FileReader(file);*/
/*        char [] a = new char[200];   // Количество символов, которое будем считывать
        fr.read(a);   // Чтение содержимого в массив

        for(char c : a)
            System.out.print(c);   // Вывод символов один за другими
        fr.close();*/

/*
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("Student.txt", true));
*/

/*        bufferedWriter.write("Mirislom");
        bufferedWriter.newLine();
        bufferedWriter.write("Qalaysan");
        bufferedWriter.newLine();
        bufferedWriter.write("Nima gap");
        bufferedWriter.newLine();
        bufferedWriter.write("Uychila yaxshimi");*/
/*        File file1 = new File("Student.txt");
        file.renameTo(file1);*/

        // File (or directory) with old name
       /* File file = new File("oldname");*/

// File (or directory) with new name
        /*File file2 = new File("newname");*/

        /*if (file2.exists())
            throw new java.io.IOException("file exists");*/

// Rename file (or directory)
        /*boolean success = file.renameTo(file2);*/
/*
        if (!success) {
            // File was not successfully renamed
        }*/
        /*Files.move(Paths.get("Example.txt"), Paths.get("Student.txt"), StandardCopyOption.REPLACE_EXISTING);*/

        String s = "apokdpwceokfpwe";

        char[] chars = s.toCharArray();
        int  i;
        CharArrayReader charArrayReader = new CharArrayReader(chars);
        while ( ( i =  charArrayReader.read()) != -1) {
            System.out.print((char) i + " ");
        }

    }
}
