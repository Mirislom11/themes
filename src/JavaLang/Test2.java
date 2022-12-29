package JavaLang;

public class Test2 {
    public static void main(String[] args) {
        Double d1 = 123.21;
        System.out.println(Double.doubleToRawLongBits(12.1113));
        System.out.println(Double.toHexString(d1));
        String w = "qsd";
        System.out.println(Double.isNaN(22.3));
        Double d2  = Double.valueOf(0/0.);
        System.out.println(d2.isNaN());
        Double d3 = 1/0.;
        System.out.println(d3.isInfinite());

    }
}
