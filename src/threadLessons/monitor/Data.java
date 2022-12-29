package threadLessons.monitor;

import java.util.LinkedList;
import java.util.Queue;

public class Data {
    private final Object monitor = new Object();
    Queue<String> queue = new LinkedList<>();

    public void push(String element) {
        synchronized (monitor) {
            while (queue.size() > 10) {
                try {
                    monitor.wait();
                    System.out.println(Thread.currentThread().getName() + " : waiting because queue is larger then 10 " + Thread.currentThread().getName() + " " + Thread.currentThread().getState());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            queue.add(element);
            System.out.println(Thread.currentThread().getName() + " Added one element from queue - " + queue.size());
            monitor.notify();
        }
    }

    public void pop() {
        synchronized (monitor) {
            while (queue.isEmpty()) {
                try {
                    monitor.wait();
                    System.out.println(Thread.currentThread().getName() + " : waiting because queue is empty " + Thread.currentThread().getName()  + " " + Thread.currentThread().getState());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            queue.poll();
            System.out.println(Thread.currentThread().getName() + " Removed one element from queue - " + queue.size());
            monitor.notify();
        }
    }
}
