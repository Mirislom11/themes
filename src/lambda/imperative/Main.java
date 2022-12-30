package lambda.imperative;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("John", Gender.MALE),
                new Person("Maria", Gender.FEMALE),
                new Person("Aisha", Gender.FEMALE),
                new Person("Alex", Gender.MALE),
                new Person("Alice", Gender.FEMALE)
        );
        // Imperative approach
        List<Person> females = new LinkedList<>();
        for (Person person : people) {
            if (person.gender.equals(Gender.FEMALE))
                females.add(person);
        }
        for (Person female : females) {
            System.out.println(female);
        }
        System.out.println("/////////");
        // Declarative approach
        List<Person> streamFemales = people.stream().filter(person -> person.gender.equals(Gender.FEMALE)).toList();
        streamFemales.forEach(System.out::println);
    }


    static class Person {
        private final String name;
        private final Gender gender;

        public Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }
    }

    enum Gender {
        MALE, FEMALE
    }
}
