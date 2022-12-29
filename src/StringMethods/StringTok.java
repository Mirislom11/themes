package StringMethods;
import  java.util.StringTokenizer;
public class StringTok {
    public static void main(String[] args) {
        String in  =  " Mirislom = 2, Sarvar = 3 , Alish = 23";
        StringTokenizer s = new StringTokenizer(in , "=,");
/*
        while (s.hasMoreTokens()){
            String key = s.nextToken();
            String value = s.nextToken();
            System.out.println(key + " " + value);
        }*/
        String key = s.nextToken();
        String value = s.nextToken();
        System.out.println(key + " " + value);
        System.out.println(s.countTokens());
    }
}
