package lambda;

import java.util.Date;

public class Person {
    private String name;
    private String lastName;
    private Integer age;


    public Person(String name, String lastName, Integer age) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }
    public String getFullName () {
        return name + lastName;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public Integer getAge() {
        return age;
    }
}
