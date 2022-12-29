package threadLessons;

public class Notify3 extends Thread{
    Notify1 notify1;
    Notify3(Notify1 notify1)
    {
        this.notify1 = notify1;
    }
    public void run()
    {
        synchronized(this.notify1)
        {
            System.out.println("Starting of " + Thread.currentThread().getName());
            // call the notify() method
            this.notify1.notify();
            System.out.println(Thread.currentThread().getName() + "...notified "  + Thread.currentThread().getState());
        }
    }
}
