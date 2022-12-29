package Inheritance;

public class Examle1 {
    int i;
    int j;
    Examle1 (int a, int b){
        i = a;
         j =b;
    }
    void show () {
        System.out.println("i : " +i + " j : " + j);
    }
}
class Examle2 extends  Examle1 {
    int k;
    Examle2(int a, int b, int c) {
        super(a, b);
        k =c;
    }
     void show () {
        System.out.println("i : " +i + " j : " + j + " k : " +k);
    }
}

class Override {
    public static void main(String[] args) {
        Examle2 examle2 = new Examle2(1, 3,4);
        examle2.show();
        Examle1 examle1 = new Examle1(12,22);
        examle1.show();
        int a = 5;
        do {

            System.out.print(a++ + " ");
        } while (a <= 15);
        int  b = 5;


    }
}

