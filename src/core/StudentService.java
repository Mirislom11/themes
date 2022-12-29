package core;

import java.util.*;

public class StudentService {
    List<Student> students = new ArrayList<>();

    public Student add(String name, Integer age) {
        Student student = new Student();
        student.setAge(age);
        student.setName(name);
        students.add(student);
        return student;
    }

    public void printStudents() {
        students.forEach(System.out::println);
    }

    public void removeById(Integer age) {
        if (!students.removeIf(student -> Objects.equals(student.getAge(), age))) {
            throw new RuntimeException("Student by this age not found");
        }
    }

    public List<Student> sortByAge() {
        List<Student> sortingStudents = new ArrayList<>(students);
        sortingStudents.sort(Comparator.comparing(Student::getAge));
        return sortingStudents;
    }

    public List<Student> sortByName () {
        List<Student> sortingStudents = new ArrayList<>(students);
        sortingStudents.sort(Comparator.comparing(Student::getName));
        return sortingStudents;
    }



}
