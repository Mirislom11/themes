package streams;

import core.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {
        /*List<String> strings = List.of("88", "11", "22", "33", "44", "55", "66");
        for (String string : strings) {
            Integer value = Integer.valueOf(string + string);
            if (value % 2 == 0) {
                System.out.println(value);
            }
        }
        strings.stream()
                .map(value -> value + value)
                .map(Integer::valueOf)
                .filter(value -> value % 2 == 0)
                .sorted()
                .skip(1)
                .limit(2)
                .mapToInt(Integer::intValue)
                .forEach(System.out::println);*/

        Optional<Student> maybeStudent =  Stream.of(
                new Student(18, "Ivan"),
                new Student(20, "Petr"),
                new Student(22, "Vasya"),
                new Student(17, "Javlon"),
                new Student(23, "Katya"),
                new Student(24, "Olya")
        )
                .reduce((student1, student2) -> student1.getAge() > student2.getAge() ? student1 : student2 );

        maybeStudent.ifPresent(System.out::println);
        maybeStudent.map(Student::getAge)
                .filter(age -> age > 23)
                .orElse(2);

        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Mirislom", "Zoirov", 23, 1.4));
        employees.add(new Employee("Xasan", "Zoirov", 19, 0.9));
        employees.add(new Employee("Eshmat", "Eshmatov", 11, 0.8));
        employees.add(new Employee("Joraqozi", "Turdaliyev", 24, 1.5));

        employees.stream()
                .filter(element -> element.getRating() > 1.2 && element.getAge() > 12)
                .collect(Collectors.toList());
      
    }

}
