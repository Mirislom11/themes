package threadLessons.monitor;

public class DataRemover extends Thread {

    private Data driver;
    public DataRemover(Data driver) {
        this.driver = driver;
    }

    public DataRemover(String name, Data driver) {
        super(name);
        this.driver = driver;
    }

    @Override
    public void run() {
        driver.pop();
    }
}
