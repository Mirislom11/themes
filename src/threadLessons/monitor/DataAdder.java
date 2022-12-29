package threadLessons.monitor;

public class DataAdder extends Thread {

    private Data driver;
    public DataAdder(Data driver) {
        this.driver = driver;
    }

    public DataAdder(String name, Data driver) {
        super(name);
        this.driver = driver;
    }

    @Override
    public void run() {
        driver.push("hello");
    }
}
