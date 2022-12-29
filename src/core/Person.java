package core;

import java.util.Objects;

public class Person {
    private Integer id;
    private String name;
    private String lastname;
    private Employee employee;

    public Person(Integer id, String name, String lastname) {
        this.id = id;
        this.name = name;
        this.lastname = lastname;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }


    public class Employee {
        private int rate;
        private String workingPlace;

        public void setRate(int rate) {
            id = rate;
            this.rate = rate;
        }


        public void setWorkingPlace(String workingPlace) {
            this.workingPlace = workingPlace;
        }

        public int getRate() {
            return rate;
        }

        public String getWorkingPlace() {
            return workingPlace;
        }

        @Override
        public String toString() {
            return "Employee{" +
                    "rate=" + rate +
                    ", workingPlace='" + workingPlace + '\'' +
                    '}';
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(id, person.id) && Objects.equals(name, person.name) && Objects.equals(lastname, person.lastname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, lastname);
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", employee=" + employee +
                '}';
    }
}
