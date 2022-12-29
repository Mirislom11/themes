package JavaLang;

import java.util.ArrayList;
import java.util.Collections;

public class Test1 implements Comparable<Float> {
    public static void main(String[] args) {
        Float f1 = 12.3f;
        System.out.println(f1.byteValue());

        int result =  f1.compareTo(11.5f);
        System.out.println(result);
        int r = f1.floatToIntBits(f1);
        System.out.println(r);
        int hashcode = f1.hashCode();
        System.out.println(hashcode);
        Float f2 = 123.2f;
        System.out.println(f2.intValue());
        System.out.println(f1.isInfinite());
        ArrayList<Float> list = new ArrayList<>();
        list.add(12.4f);
        list.add(5.3f);
        list.add(42.8f);
        list.add(11.4f);
        list.add(212.2f);
        list.set(1, 2.2f);
        /*Collections.sort(list);*/
        System.out.println(list);
        /*Long l = Long.decode("12l");*/
        /*System.out.println(l);*/
        Long l2 = Long.parseLong("12", 21);
/*        System.out.println(l2);
        Long l3= Long.reverse(124L);
        System.out.println(l3);*/
/*        Long l4  = Long.rotateRight(12, 1);
        System.out.println(l4);*/
        /*int l5 = Long.signum(-12341L);
        System.out.println(l5);*/
        String s1 = Long.toBinaryString(124L);
        System.out.println(s1);

    }

    @Override
    public int compareTo(Float o) {
        return this.compareTo(o);
    }
}
