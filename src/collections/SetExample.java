package collections;

import core.Person;

import java.util.HashSet;
import java.util.Set;

public class SetExample {

    public static void main(String[] args) {
        Set set = new HashSet();
        System.out.println(set.add( new Person(1, "Ali", "Aliev")));
        System.out.println(set.add(new Person(1, "Ali", "Aliev")));
    }
}
