package threadLessons;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class SumNumbers {
    private static long value = 1_000_000_000;
    private static long sum = 0l;


    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        List<Future<Long>> futureResults = new ArrayList<>();
        long valueDividedBy10 = value / 10;
        for (int i = 0; i < 10; i++) {
            long from = valueDividedBy10 * i + 1;
            long to = valueDividedBy10 * ( i + 1 );
            Future<Long> futurePartSums = executorService.submit(new PartialSum(from, to));
            futureResults.add(futurePartSums);
        }
        for (Future<Long> futureResult : futureResults) {
            sum += futureResult.get();
        }
        System.out.println(sum);
        executorService.shutdown();

    }

    private static class PartialSum implements Callable<Long> {
        private long from;
        private long to;
        private long localSum;

        public PartialSum(long from, long to) {
            this.from = from;
            this.to = to;
        }

        @Override
        public Long call() throws Exception {
            for (long i = from; i < to; i++) {
                localSum+=i;
            }
            System.out.println("Sum from: " + from + " to: " + to  + " localSum: "  + localSum);
            return localSum;
        }
    }
}
