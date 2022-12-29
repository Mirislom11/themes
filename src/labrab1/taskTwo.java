package labrab1;

public class taskTwo {
    public static void main(String[] args) {
        double a = 1.8, b = 2, e = 0.0001, x, k;
        System.out.println("a: " + a);
        System.out.println("b: " + b);
        System.out.println("e: " + e);
        if (f(a) * f2(a) > 0){
            System.out.println(" x = a: " + a);
            x = a;
        }else {
            if (f(b) * f2(b) > 0){
                System.out.println("x = b: " + b);
                x = b;
            }else {
                System.out.println("condition not met");
                x = Math.pow(-10, 10);
            }
        }
        if (Math.pow(-10, 10) < x){
            k = 0;
            while (true){
                x = x - f(x)/f1(x);
                k = k+1;
                if (Math.abs(f(x))< e) break;
            }
            System.out.println("x: " + x);
            System.out.println("k : " + k);
        }

    }

    public static double f(double x) {
        return 2.2 * x - Math.pow(2, x);
    }
    public static  double f1 (double x) {
        return 2.2 - Math.log(x) * Math.pow(2.2, x);
    }
    public static  double f2 (double x) {
        return Math.pow(2, x)/x - Math.log(2) * Math.pow(2, x) * Math.log(x);
    }
}
