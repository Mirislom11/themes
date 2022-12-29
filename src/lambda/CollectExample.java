package lambda;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.stream.Collectors;

public class CollectExample {

    public static void main(String[] args) {

        List<NamePhoneEmail> namePhoneEmailList = new ArrayList<>();
        namePhoneEmailList.add(new NamePhoneEmail("John", "+998975102334", "john@gmail.com"));
        namePhoneEmailList.add(new NamePhoneEmail("Steve", "+998999101556", "steve@gmail.com"));

        List<NamePhone> list = namePhoneEmailList.stream()
                .map(a -> new NamePhone(a.getName(), a.getPhone()))
                .collect(Collectors.toList());

        System.out.println(list);


        List<String> stringList = new LinkedList<>();
        stringList.add("ALfa");
        stringList.add("Betta");
        stringList.add("Gamma");
        stringList.add("Delta");
        stringList.add("Ksi");
        stringList.add("Omega");

        ListIterator<String> listIterator = stringList.listIterator();
        listIterator.forEachRemaining(a -> System.out.println(a));
    }
}
