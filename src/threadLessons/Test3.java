package threadLessons;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Test3 {
    public static void main(String[] args) {
        new Worker().main();
    }
}

 class Worker {
    Object lock1 = new Object();
    Object lock2 = new Object();
    Random random = new Random();
    List<Integer> params1 = new ArrayList<>();
    List<Integer> params2 = new ArrayList<>();

    public void addToList (){
        synchronized (lock1){
            try {
                Thread.sleep(1);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            params1.add(random.nextInt(100));
        }
    }

    public void addToList2 () {
        synchronized (lock2) {
            try {
                Thread.sleep(1);
            }catch (InterruptedException e) {
                e.printStackTrace();
            }
            params2.add(random.nextInt(100));
        }
    }
    public  void work () {
        for (int i = 0; i < 1000; i++) {
            addToList();
            addToList2();
        }
    }

/*    public void main () {
        long before = System.currentTimeMillis();
        work();
        long after = System.currentTimeMillis();
        System.out.println("Programm took: " + (after - before) + "ms to run");
        System.out.println("List 1: "+ params1.size());
        System.out.println("List 2: " + params2.size());
    }*/
     public void main () {
         Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                work();
            }
        });

         Thread thread2 = new Thread(new Runnable() {
             @Override
             public void run() {
                 work();
             }
         });

         long before = System.currentTimeMillis();
         thread.start();
         thread2.start();
         try {
             thread.join();
             thread2.join();
         }catch (InterruptedException e) {
             e.printStackTrace();
         }
        long after = System.currentTimeMillis();
        System.out.println("Programm took: " + (after - before) + "ms to run");
        System.out.println("List 1: "+ params1.size());
        System.out.println("List 2: " + params2.size());
    }

}

