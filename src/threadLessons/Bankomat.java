package threadLessons;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Bankomat {
    private static final Lock lock = new ReentrantLock();
    public static void main(String[] args) {
        Employee employee1 = new Employee("Zaur", lock);
        Employee employee2 = new Employee("Oleg", lock);
        Employee employee3 = new Employee("Dmitriy", lock);
        Employee employee4 = new Employee("Ivan", lock);
        employee1.start();
        employee2.start();
        employee3.start();
        employee4.start();
    }

    static class Employee extends Thread{
        private final String name;
        private final Lock lock;

        public Employee (String name, Lock lock) {
            this.name = name;
            this.lock = lock;
        }
        public void run () {
            if (lock.tryLock()) {
                try {
                    System.out.println(name + " : " + "Пользутся банкоматом");
                    Thread.sleep(2000);
                    System.out.println(name + " : " + "Закончил пользование банкоматом");
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }else {
                System.out.println(name + " : " + "не хочет ждать банкомат");
            }
        }
    }
}



