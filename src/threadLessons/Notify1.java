package threadLessons;

public class Notify1 extends Thread{
    public void run()
    {
        synchronized(this)
        {
            System.out.println("Starting of " + Thread.currentThread().getName());
            try {
                this.wait();
            }
            catch (InterruptedException e) {
                e.printStackTrace();}
            System.out.println(Thread.currentThread().getName() + "...notified "  + Thread.currentThread().getState());
        }
    }
}
