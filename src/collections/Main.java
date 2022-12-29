package collections;

import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;

public class Main {

    public static void main(String[] args) {
/*        Person personOne = new Person(1, "Ivan", "Ivanov");
        Person personTwo  = new Person(2, "Petr", "Petrov");

        Map< Integer, Person> map = new HashMap<>();
        map.put(personOne.getId(), personOne);
        map.put(personTwo.getId(), personTwo);

        for (Map.Entry<Integer, Person> set: map.entrySet()){
            System.out.println(set.getKey() + "  " + set.getValue());
        }*/

        /*System.out.println(personOne.equals(personTwo));*/
        /*Integer i = new Integer(23);
        Integer s = new Integer(23);
        Integer.valueOf(1);

        if (i == s) System.out.println(true);
        if (Integer.valueOf(25).equals(Integer.valueOf(25))) System.out.println(true);
        if (Integer.valueOf(300) == Integer.valueOf(300)) System.out.println(true);*/

        List<String> stringList = new ArrayList<>();
        stringList.add("str1");
        stringList.add("str2");
        stringList.add("str3");
        stringList.add("str4");
        stringList.add("str5");

        System.out.println(stringList);
        Iterator<String> stringIterator = stringList.iterator();
        while (stringIterator.hasNext()) {
            if (stringIterator.next().equals("str2")) {
                stringIterator.remove();
                stringIterator.next();
                stringIterator.remove();
            }
        }
        System.out.println(stringList);

        stringList.removeIf(element -> element.equals("str5"));
    }
}
