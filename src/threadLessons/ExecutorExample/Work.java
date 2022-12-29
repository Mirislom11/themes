package threadLessons.ExecutorExample;

public class Work implements Runnable{
    private int id;
    public Work(int id){
        this.id = id;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(5000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Work: "+ id + " was completed");
    }
}
