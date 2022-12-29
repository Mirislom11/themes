package threadLessons.ExecutorExample;

import java.util.concurrent.*;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        for (int i = 0; i < 5; i++) {
            executorService.submit(new Work(i));
        }
        executorService.shutdown();
        System.out.println("All tasks was submitted");
        executorService.awaitTermination(1, TimeUnit.DAYS);
    }
}
