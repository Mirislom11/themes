package labrab1;

import javax.crypto.MacSpi;

import static java.lang.Math.pow;
import static java.lang.System.out;

public class IterationsMethod {

    public static void main(String[] args) {
        double err=0.0001;
        double  x0=0, a=0, b=1;

        if (f(a) * f2(a) > 0.0) {
            x0 = b;
            out.println(find1(x0,err, a));
        }
        else if (f(b) * f2(b) > 0.0) {
            x0 = a;
            out.println(find2(x0,err,a));
        }
        out.println("x0 = "+x0);
    }

    public static double find1(double x0, double err, double a) {
        double x;
        while(true) {
            x = x0 - f(x0) * ((x0 - a) / (f(x0) - f(a)));
            if(Math.abs(x - x0) < err) break;
            x0 = x;
        }

        return x;
    }

    public static double find2(double x0, double err, double b)
    {
        double x;
        while (true) {
            x = x0 - f(x0) * ((b - x0) / (f(b) - f(x0)));
            if (Math.abs(x - x0) > err) break;
                x0 = x;
        }

        return x;
    }

    public static double f(double x){
        return Math.pow(x,3)-0.2 * Math.pow(x, 2) + 0.5 * x -1;
    }

    public static double f2(double x){
        return 6 * x - 0.4;
    }
}
