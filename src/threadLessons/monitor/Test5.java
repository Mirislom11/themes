package threadLessons.monitor;

import java.util.Objects;

public class Test5 {
    // 3 разных потока для звонков с разных каналов
    private static final Object monitor = new Object();

    public void mobileCall() {
        synchronized (monitor) {
            System.out.println(monitor);
            System.out.println("Mobile call starts");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Mobile call ends");
        }
    }

    public void skypeCall() {
        synchronized (monitor) {
            System.out.println(monitor);
            System.out.println("Skype call starts");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Skype call ends");
        }
    }

    public void whatsAppCall() {
        synchronized (monitor) {
            System.out.println(monitor);
            System.out.println("Whats app call starts");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Whats call ends");
        }
    }

    public static void main(String[] args) {
        Thread thread1 = new Thread(new RunnableImplMobile());
        Thread thread2 = new Thread(new RunnableImplSkype());
        Thread thread3 = new Thread(new RunnableImplWhatsApp());
        thread1.start();
        thread2.start();
        thread3.start();
    }
}

class RunnableImplMobile implements Runnable {
    @Override
    public void run() {
        new Test5().mobileCall();
    }
}

class RunnableImplSkype implements Runnable {
    @Override
    public void run() {
        new Test5().skypeCall();
    }
}

class RunnableImplWhatsApp implements Runnable {
    @Override
    public void run() {
        new Test5().whatsAppCall();
    }
}

