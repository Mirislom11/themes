package lambda;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {
    public static void main(String[] args) {
        int increment = incrementByFunction.apply(1);
        System.out.println(increment);

        int incrementByTen =  incrementByFunction.andThen(multiplyFunction).apply(1);
        System.out.println(incrementByTen);
        int incrementOneAndMultiplication = multiplyBiFunction.apply(1, 10);
        System.out.println(incrementOneAndMultiplication);
    }
    static Function<Integer, Integer> incrementByFunction = number -> number +1;

    static Function<Integer, Integer> incrementByOneFunction =
            number -> number + 1;

    static int increment (int number) {
        return number + 1;
    }
    static Function<Integer, Integer> multiplyFunction = number -> number * 10;

    static BiFunction<Integer, Integer, Integer> multiplyBiFunction = (argumentOne, argumentTwo) -> (argumentOne + 1) * argumentTwo;
}
