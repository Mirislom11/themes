package threadLessons.ExecutorExample;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ThreadPoolExample2 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Main thread started");
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(1);
        scheduledExecutorService.scheduleWithFixedDelay(new RunnableImplementation(), 0, 2, TimeUnit.SECONDS);
        Thread.sleep(20000);
        scheduledExecutorService.shutdown();
        System.out.println("Main task end");
    }

    public static class RunnableImplementation implements Runnable {
        @Override
        public void run() {
            System.out.println("Thread schedule started");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);

            }
            System.out.println("Thread schedule end");
        }
    }
}
