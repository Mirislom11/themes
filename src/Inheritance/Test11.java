package Inheritance;

import JavaLang.Test12;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Test11 extends Test12 {
    public static void main(String[] args) {
        Map<Integer, String> maps = new HashMap<>();
        maps.put(1, "Ali");
        maps.put(2, "Vali");
        maps.put(3, "Toshmat");
        maps.put(4, "Eshmat");

        for (Map.Entry<Integer, String> set: maps.entrySet()) {
            System.out.println(set.getKey() + " : " + set.getValue());
        }
        Set<String> stringSet = new HashSet<>();
        stringSet.add("Samandar");
        stringSet.add("Sardor");
        System.out.println(stringSet);
        for (String set: stringSet) {
            System.out.println(set + " : " + set.hashCode());
        }

    }

    @java.lang.Override
    protected void ShowTest12() {
        super.ShowTest12();
    }
}
