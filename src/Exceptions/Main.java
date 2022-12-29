package Exceptions;

public class Main {
    public static void main(String[] args) {
        try {
            System.out.println(methodA());
        }
        catch (Throwable ex) {
            System.out.println("Main Catch");
        }
    }
    static int methodA() {
        if(methodB() >0) {
            try {
                throw new UnknownError();
            }
            catch (Exception ex) {
                return 2;
            }
        }
        else {
            return 3;
        }
    }
    static int methodB()
    {
        try {
            throw new RuntimeException();
        }
        catch (Exception ex) {
            return 0;
        }
        finally {
            return 1;
        }
    }
}
