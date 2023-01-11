package threadLessons;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockExample {
    public static void main(String[] args) {
        Call call = new Call();
        Thread thread1 = new Thread(call::mobileCall);
        Thread thread2 = new Thread(call::twitterCall);
        Thread thread3 = new Thread(call::whatsAppCall);
        thread1.start();
        thread2.start();
        thread3.start();
    }
}

class Call {
    private static final Lock lock = new ReentrantLock();

    public void mobileCall () {
        lock.lock();
        System.out.println("Mobile call started");
        try {
            Thread.sleep(3000);
            System.out.println("Mobile call end");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }finally {
            lock.unlock();
        }
    }
    public void twitterCall () {
        lock.lock();
        System.out.println("Twitter call started");
        try {
            Thread.sleep(2000);
            System.out.println("Twitter call end");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }finally {
            lock.unlock();
        }
    }
    public void whatsAppCall() {
        lock.lock();
        try {
            System.out.println("whatsApp call started");
            Thread.sleep(5000);
            System.out.println("whatsApp call end");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }finally {
            lock.unlock();
        }
    }

}
