package collections;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Task3 {

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("Marty" , "Stepp");
        map.put("Struart", "Reges");
        map.put("Jessica", "Miller");
        map.put("Amanda", "Camp");
        map.put("Hal", "Camp");
        System.out.println(isUnique(map));
     }
     public static boolean isUnique (Map<String, String> map) {
        return map.size() == new HashSet<>(map.values()).size();

    }
}
