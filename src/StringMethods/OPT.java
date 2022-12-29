package StringMethods;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

public class OPT {
    public static void main(String[] args) {
        List<String> list  = new LinkedList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("V");
        list.add("X");
        for (String s : list){
            Optional<String> o = Optional.of(s);
            if (o.isPresent()) {
                System.out.println(o.get());
            }
        }
    }
}
