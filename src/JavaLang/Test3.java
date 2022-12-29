package JavaLang;

import com.sun.nio.sctp.SctpStandardSocketOptions;
import jdk.swing.interop.SwingInterOpUtils;

public class Test3 {
    public static void main(String[] args){
        System.out.println(Integer.SIZE);
        Integer t = 12;
        System.out.println(t.TYPE);
        Byte b = t.byteValue();
        System.out.println(b.TYPE);
        System.out.println(t.toString());
        System.out.println(Short.decode(String.valueOf(1)));
        System.out.println(Short.parseShort("12"));
        System.out.println(Short.reverseBytes((short) 32));
    }
}
