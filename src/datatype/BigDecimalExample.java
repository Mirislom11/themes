package datatype;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class BigDecimalExample {
    public static void main(String[] args) {
        BigDecimal s = new BigDecimal("-123.45");
        /*System.out.println(s.subtract(new BigDecimal("23.45")));*/
        /*BigDecimal result = s.divide(new BigDecimal("2.5")).setScale(1, RoundingMode.UP);
        System.out.println(result);
        Double d = new BigDecimal(1.555d).setScale(2, RoundingMode.HALF_UP).doubleValue();
        System.out.println(d);*/
        System.out.println(s.add(new BigDecimal(2)));
        System.out.println(s.abs());

    }
}
