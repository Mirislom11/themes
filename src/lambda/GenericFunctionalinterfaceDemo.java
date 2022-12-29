package lambda;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;

public class GenericFunctionalinterfaceDemo {

    public static void main(String[] args) {
/*        SomeFunc<String> reverse = (str) -> {
            String result = "";
            int i;
            for (i = str.length()-1; i>=0; i--) {
                result += str.charAt(i);
            }
            return result;
        };

        System.out.println(reverse.func("Mirislom"));

        SomeFunc<Integer> factorial = (n) -> {
            int result = 1;
            for(int i=1; i<= n; i++){
                result = i * result;
            }
            return result;
        };
        System.out.println(factorial.func(3));

        System.out.println(toUpper((str) -> str.toUpperCase(Locale.ROOT), "hello"));*/

        List<String> strings = List.of("01", "02", "03", "04", "08", "011", "05");

        Collections.sort(strings, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return -o1.compareTo(o1);
            }
        });
    }

    public static  String toUpper (SomeFunc<String> someFunc, String s) {
      return someFunc.func(s);
    }
}
