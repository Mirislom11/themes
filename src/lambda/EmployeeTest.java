package lambda;

import core.Employee;
import core.EmployeeService;

import java.util.Comparator;

public class EmployeeTest {
    private static final EmployeeService service = new EmployeeService();


    public static void main(String[] args) {
        System.out.println("Adding employee...");
        service.add(() -> new Employee("Misha", "Ivanov", 23, 2.3));
        service.add(() -> new Employee("Sergey", "Fedorov", 32, 5.6));
        service.add(() -> new Employee("Aleksandr", "Orlov", 27, 4.5));
        service.add(() -> new Employee("Natalya", "Sidorovna", 22, 3.2));
        service.add(() -> new Employee("Dmitriy", "Govrilov", 44, 2.1));
        System.out.println("Finished adding employee...");
        System.out.println("Showing after adding....");
        service.printEmployees();

        service.clearLowerRating(employee -> employee.getRating() < 2.5);
        System.out.println("Showing after predicate....");
        service.printEmployees();
        Double highestRating = service.findHighestRating(employees -> {
            return employees.stream()
                    .max(Comparator.comparing(employee -> employee.getRating()))
                    .get().getRating();
        }, service.getEmployees());

        System.out.println("Highest rating: " + highestRating);
    }
}
