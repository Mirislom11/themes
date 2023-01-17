package threadLessons.ExecutorExample;


import threadLessons.monitor.Market;


import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class RunnableFactorial {
    private static Integer factorialResult;

    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Factorial factorial = new Factorial(5);
        executorService.execute(factorial);
        executorService.shutdown();
        executorService.awaitTermination(1000, TimeUnit.SECONDS);

        System.out.println(factorialResult);
        System.out.println(executorService.awaitTermination(10, TimeUnit.SECONDS));

        //////////////////////////////////////////////////////////////////////////////////////
        /*ExecutorService executorService = Executors.newFixedThreadPool(2);*/

        /*Market market = new Market();
        Producer2 producer = new Producer2(market);
        Consumer2 consumer = new Consumer2(market);


        executorService.execute(new Thread(producer));
        executorService.execute(new Thread(consumer));
        executorService.awaitTermination(1000, TimeUnit.SECONDS);
        executorService.shutdown();*/
    }

    private static class Factorial implements Runnable {
        private Integer f;

        public Factorial(int f) {
            this.f = f;
        }

        @Override
        public void run() {
            if (f <= 0) {
                System.out.println("Вы ввели неверное число");
                return;
            }
            int result = 1;
            for (int i = 1; i <= f; i++) {
                result *= i;
            }
            factorialResult = result;

        }
    }
}

class Producer2 implements Runnable {
    private Market market;

    public Producer2(Market market) {
        this.market = market;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            market.putBread();
        }
    }
}

class Consumer2 implements Runnable {
    private Market market;

    public Consumer2(Market market) {
        this.market = market;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            market.getBread();
        }
    }
}