package threadLessons;

public class Notify2 extends Thread{
    Notify1 notify1;
    public Notify2(Notify1 notify1)
    {
        this.notify1 = notify1;
    }
    public void run()
    {
        synchronized(this.notify1)
        {
            System.out.println("Starting of " + Thread.currentThread().getName());
            try {
                this.notify1.wait();
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "...notified: " + Thread.currentThread().getState());
        }
    }
}
