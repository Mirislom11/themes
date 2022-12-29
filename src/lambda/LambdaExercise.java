package lambda;

import streams.Student;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class LambdaExercise {
    public static void main(String[] args) {
        /*List<Integer> integerList = List.of(1,2, 3,4, 6,8, 5, 15, 20, 10, 25);

        OptionalDouble optionalDouble = integerList.stream()
                .filter(value -> value % 2 != 0 && value % 5 == 0)
                .mapToInt(Integer::intValue)
                .average();

        optionalDouble.ifPresent(System.out::println);*/

        List<String> list = List.of(
                "string-1",
                "string-1",
                "string-2",
                "string-4",
                "string-10",
                "string-12",
                "string-16"
        );
        /*Long result = list.stream()
                .filter(value -> value.length() > 8)
                .distinct()
                .count();

        System.out.println(result);

        List<Integer> integers = List.of(5, 2,4,2,1);
            String r = integers.stream()
                    .map(String::valueOf)
                    .collect(Collectors.joining());
        System.out.println(r);

         */
        List<Person> personList = List.of(
                new Person("Ivan", "Ivanov", 20),
                new Person("Petr", "Petrov", 25),
                new Person("Sveta", "Svetikova", 33),
                new Person("Kate", "Ivanova", 45),
                new Person("Slava", "Slavikov", 18),
                new Person("Arni", "Kutuzov", 56)
        );
        personList.stream()
                .filter(person -> person.getFullName().length() < 15 )
                .max((person1, person2) -> person1.getAge().compareTo(person2.getAge()))
                .map(Person::getFullName)
                .ifPresent(System.out::println);

        List<Integer> integerList = List.of(1,2, 3,4, 6,8, 5, 15, 20, 10, 25);

        int result = integerList.stream()
                .reduce(1, (a, b) -> {
                    if(b % 2 == 0) return  a *b;
                    else return a;
                });
        System.out.println(result);
    }
}
