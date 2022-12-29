package lambda;

import java.util.List;

public class StreamExample {
    public static void main(String[] args) {
        List<String> strings = List.of("11", "22", "33", "44", "55");
        strings.stream()
                .map(value -> value + value)
                .map(value -> Integer.valueOf(value))
                .filter(value -> value % 2 == 0)
                .sorted()
                .forEach(System.out::println);


    }
}
