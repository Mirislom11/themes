package stack_and_heap;

public class ExampleOne {
    public static void main(String[] args) {
        int ramValue = 1000;
        String resultOne = "Hello";
        String resultTwo = new String("Hello");
        System.out.println(resultOne == resultTwo);
        String resultThree = "Hello";
        System.out.println(resultOne == resultThree);
    }
}
