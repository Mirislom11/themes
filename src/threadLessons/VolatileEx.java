package threadLessons;

public class VolatileEx extends Thread{
    volatile private boolean b = true;

    @Override
    public void run () {
       long counter = 0;
       while (b) {
           counter++;
       }
        System.out.println("Loop is finished counter: " + counter);
    }

    public static void main(String[] args) throws InterruptedException {
        VolatileEx thread = new VolatileEx();
        /** Поток VolatileEx переходит в Runnable и работает*/
        thread.start();
        /** Поток main спит 3 сек*/
        Thread.sleep(3000);
        /**Затем просыпается main поток*/
        System.out.println("After three second it is time to wake up");
        /** b = false*/
        thread.b = false;
        /**main ожидает завершение thread volatile*/
        thread.join();
        /** конец */
        System.out.println("End of program");
    }
}
