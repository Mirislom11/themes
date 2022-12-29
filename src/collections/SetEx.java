package collections;

import java.io.FilterOutputStream;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetEx {
    public static void main(String[] args) {
        TreeSet<Integer> exampleSet = new TreeSet<>();
        exampleSet.add(1);
        exampleSet.add(11);
        exampleSet.add(34);
        exampleSet.add(12);
        exampleSet.add(3);
        System.out.println(exampleSet);
        System.out.println(exampleSet.ceiling(11));
        System.out.println(exampleSet.floor(10));
        System.out.println(exampleSet.tailSet(3));
        System.out.println(exampleSet.headSet(11));

    }
}
