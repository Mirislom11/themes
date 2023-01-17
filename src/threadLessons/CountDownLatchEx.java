package threadLessons;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchEx {
    private static CountDownLatch countDownLatch = new CountDownLatch(3);

    private static void marketStaffIsOnPlace() throws InterruptedException {
        Thread.sleep(2000);

        System.out.println("Market staff came to work");
        countDownLatch.countDown();
        System.out.println("countDownLatch = " + countDownLatch.getCount());
    }
    public static void everyThingIsReady () throws InterruptedException {
        Thread.sleep(3000);
        System.out.println("EveryThing is ready do lets open market");
        countDownLatch.countDown();
        System.out.println("countDownLatch = " + countDownLatch.getCount());
    }

    public static void openMarket () throws InterruptedException {
        Thread.sleep(4000);
        System.out.println("Market is opened");
        countDownLatch.countDown();
        System.out.println("countDownLatch = " + countDownLatch.getCount());
    }

    public static void main(String[] args) throws InterruptedException {
        new Friend("Zaur", countDownLatch);
        new Friend("Oleg", countDownLatch);
        new Friend("Nikolay", countDownLatch);
        new Friend("Sergey", countDownLatch);
        marketStaffIsOnPlace();
        everyThingIsReady();
        openMarket();
    }

    private static class Friend extends Thread {
        private String name;
        private CountDownLatch countDownLatch;
        public Friend (String name, CountDownLatch countDownLatch) {
            this.name = name;
            this.countDownLatch = countDownLatch;
            this.start();
        }

        @Override
        public void run() {
            try {
                countDownLatch.await();
                System.out.println(name + " приступил (а) к закупке");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
