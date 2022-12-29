package core;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class EmployeeService {
    private List<Employee> employees = new ArrayList<>();

    public void add (Supplier<Employee> supplier) {
        employees.add(supplier.get());
    }

    public List<Employee> getEmployees () {return employees;}

    public void printEmployees() {
        employees.forEach(employee -> System.out.println(employee));
    }

    public void clearLowerRating (Predicate<Employee> predicate) {
        employees.removeIf(predicate);
    }

    public Double findHighestRating (Function<List<Employee>, Double> function, List<Employee> employees) {
        return function.apply(this.employees);
    }
}
