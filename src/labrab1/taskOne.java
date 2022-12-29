package labrab1;

public class taskOne {
    public static void main(String[] args) {
        double a = 0.0;
        double b = 1.0;
        int n =10;
        /*System.out.println("lef rec" + " " + leftRec(a, b, n));
        System.out.println("trapeze" + " " + trapeze(a, b, n));
        System.out.println("sypson" + " " + sympson(a, b, n));*/
        int i = 0;
        double diff;
        double eps = 0.001;
        do {
            i++;
            diff = Math.abs(trapeze(a, b, n * i) - trapeze(a, b, n * (i+1)));
        }while (diff > eps);
        System.out.println("i: " + i + " , "+ "n: " + n + " leftRec: " + trapeze(a, b, n * (i+1)));

    }

    public static double f(double x) {
       return Math.exp(Math.pow(-x, 2)) * Math.sin(Math.pow(x, 2) + 1);
    }

    public static double leftRec(double a, double b, int n) {
        double h = (b -a) / n;
        double sum = 0.0;
        for (int i = 0; i < n-1; i++) {
            sum += h * f(a + i * h);
        }
        return sum;
    }

    public static double trapeze(double a, double b, int n) {
        double h = (b -a) / n;
        double sum = f(a) + f(b);
        for (int i = 1; i < n-1; i++) {
            sum += 2 * f (a + i* h);
        }
        sum *= h/2;
        return sum;
    }

    public static double sympson(double a, double b, int n) {
        double h = (b -a) / n;
        double sum = f(a) + f(b);
        int k;
        for (int i = 1; i < n-1; i++) {
            k = 2 + 2 * (i % 2);
            sum += k * f (a + i* h);
        }
        sum *= h/3;
        return sum;
    }
}
