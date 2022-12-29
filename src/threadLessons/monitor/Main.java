package threadLessons.monitor;

public class Main {
    public static void main(String[] args) {
        Data driver = new Data();
        for (int i = 0; i < 20; i++) {
            new DataAdder(driver).start();
        }
        for (int i = 0; i < 20; i++) {
            new DataRemover(driver).start();
        }
    }
}
