package threadLessons.ExecutorExample;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class RunnableFactorial {
    private static Integer factorialResult;

    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Factorial factorial = new Factorial(5);
        executorService.execute(factorial);

        /*System.out.println(executorService.awaitTermination(10, TimeUnit.SECONDS));*/
        System.out.println(factorialResult);
        executorService.shutdown();
    }

    private static class Factorial implements Runnable {
        private Integer f;
        public Factorial (int f) {
            this.f = f;
        }

        @Override
        public void run() {
            if (f <= 0) {
                System.out.println("Вы ввели неверное число");
                return;
            }
            int result =1;
            for (int i = 1; i <= f; i++) {
                result*=i;
            }
            factorialResult = result;

        }
    }
}
