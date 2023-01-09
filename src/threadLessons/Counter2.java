package threadLessons;

public class Counter2 {
     static int count = 0;

}

class MyRunnableImpl2 implements Runnable {
    public void doWork () {
        synchronized (this) {
            Counter2.count++;
            System.out.print(Counter2.count + " ");
        }
    }


    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            doWork();
        }
    }
}
