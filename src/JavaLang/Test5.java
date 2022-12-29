package JavaLang;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLOutput;

public class Test5 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader( new InputStreamReader(System.in));

      String str;
      int i;
      int sum = 0;
        System.out.println("Vvedite chislom 0 dlya vixpda");
        do{
        str = bf.readLine();
        try{
            i = Integer.parseInt(str);
        }catch (NumberFormatException e){
            System.out.println("non format");
            i=0;
        }
        sum+=i;
            System.out.println(sum);
        }while (i!=0);
    }
}
