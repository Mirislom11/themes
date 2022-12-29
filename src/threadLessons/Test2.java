package threadLessons;

public class Test2{
    private int counter;

    public static void main(String[] args) {
        Test2 test = new Test2();
        try {
            test.doWork();
        }catch (InterruptedException e){
            e.printStackTrace();
        }

    }

    public void doWork () throws InterruptedException{
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    counter++;
                }
            }
        });
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    counter++;
                }
            }
        });
        thread.start();
        thread1.start();
        thread.join();
        thread1.join();
        System.out.println(this.counter);
    }
}
