package lambda;

import core.Student;
import core.StudentService;

import java.util.List;

public class StudentTest {
    private static final StudentService service = new StudentService();
    public static void main(String[] args) {
        service.add("Mirislom", 19);
        service.add("Xojiakbar", 24);
        service.add("Sohib", 20);
        service.add("Elbek", 22);
        service.printStudents();

        List<Student> studentSortedByAge = service.sortByAge();
        System.out.println(studentSortedByAge);

        List<Student> studentSortedByName = service.sortByName();
        System.out.println(studentSortedByName);
    }
}
