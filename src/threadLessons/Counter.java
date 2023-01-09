package threadLessons;

public class Counter {
    volatile static int count = 0;

}

class MyRunnableImpl implements Runnable {
    public void increment () {
        Counter.count++;
        System.out.println(Counter.count + " ");
    }


    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            increment();
        }
    }
}
