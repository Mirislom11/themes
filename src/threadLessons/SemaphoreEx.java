package threadLessons;

import java.util.concurrent.Semaphore;

public class SemaphoreEx {
    public static void main(String[] args) {
        Semaphore callBox = new Semaphore(2);
        new Person("Zaur", callBox);
        new Person("Oleg", callBox);
        new Person("Elena", callBox);
        new Person("Viktor", callBox);
        new Person("Viktor", callBox);
        new Person("Marina", callBox);

    }

    private static class Person extends Thread {
        private String name;
        private Semaphore callBox;

        public Person (String name, Semaphore callBox) {
            this.name = name;
            this.callBox = callBox;
            this.start();
        }

        public void run () {
            try {
                System.out.println(name + " ждет...");
                callBox.acquire();
                System.out.println(name + " пользуется телефоном");
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            finally {
                callBox.release();
            }
        }
    }
}
