package Exceptions;

public class Test1 {
    public static void preparingToExceptions(int []arr) {
        int [] array  = new int[10];


        for (int i=0; i< array.length; i++) {
        array[i] = i;
        }

        try {
            /*array[43] =  0;*/
            int x = 43/arr.length;
        }catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Вы перешли на неправильную часть array");
        }catch (ArithmeticException a){
            System.out.println("Нельзя делить на нуль");
        }

    }
    public static void main(String[] args) {
        /*int [] arr = new int[]{};
        preparingToExceptions(arr);*/
        System.out.println(meth(5));
    }
    public static int meth(int x) {
        int y = 010; //1
        try {
            y += x; //2
            if(x <= 5)
                throw new Exception(); //3
            y++;
        } //4
        catch(Exception e) { y--; } //5
        return y;
    }
}
