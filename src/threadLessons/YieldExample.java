package threadLessons;

public class YieldExample {
    public static void main(String[] args) throws InterruptedException {
        MyThread2 myThread2 = new MyThread2();
        myThread2.start();
        myThread2.join();
        for (int i = 0; i < 10; i++) {
            System.out.println("Main thread i: " + i);
        }
    }
}

class MyThread2 extends Thread{
    @Override
    public void run () {
        for (int i = 0; i < 10; i++) {
            System.out.println("MyThread2 i: " + i);
        }
    }
}
