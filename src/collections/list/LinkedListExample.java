package collections.list;

import java.util.*;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> params = new LinkedList<>();
        params.add("region");
        params.add("district");
        params.add("institutionType");
        params.add("subType");
        params.add("sector");
        /*System.out.println(params);
        System.out.println(params.element());
        System.out.println(params);*/

        /*System.out.println(params);
        System.out.println(params.getFirst());
        System.out.println(params.getLast());
        System.out.println(params);*/

        /*params.offer("limit");
        params.offerFirst("organization");
        params.offerLast("buildingType");
        System.out.println(params);
        System.out.println(params.peek());
        System.out.println(params.peekFirst());
        System.out.println(params.peekLast());*/

        /*Collections.enumeration(params);
        Collections.fill(params, "name");
        System.out.println(params);*/

        List<Integer> integers = Arrays.asList(1, 2,3,4,5);
        System.out.println(Collections.max(integers));
        System.out.println(Collections.min(integers));
        
    }
}
