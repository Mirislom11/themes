package inner_classes;

import core.Person;

public class MainExample {
    public static void main(String[] args) {
        Person person = new Person(1, "Mirislom", "Zoirov");
        Person.Employee employee =  person.new Employee();
        employee.setRate(2);
        employee.setWorkingPlace("Bilim Makon");
        person.setEmployee(employee);
        System.out.println(person);
    }
}
