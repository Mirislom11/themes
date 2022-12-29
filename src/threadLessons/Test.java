package threadLessons;

public class Test {
    public static void main(String[] args) {
 /*       MyThread myThread = new MyThread();
        MyThread myThread1 = new MyThread();
        myThread.start();
        myThread1.start();
        System.out.println("Hello from main thread" + Test.class);
        */
        Thread thread  = new Thread(new Runner());
        thread.start();
        Thread thread1 = new Thread(new Runner());
        thread1.start();
    }

}
class MyThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Hello from MyThread " + i + " " + MyThread.currentThread().getName());
        }
    }
}

class Runner implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Hello from MyThread " + i + " " + Thread.currentThread().getName());
        }
    }
}
