package queue;

import java.sql.SQLOutput;
import java.util.Queue;

public class BuyerThread implements  Runnable{
    private final Queue<Cashbox> cashboxes;

    public BuyerThread (Queue<Cashbox> cashboxes){
        this.cashboxes = cashboxes;
    }


    @Override
    public void run() {
        try {
            while (true){
                if (!cashboxes.isEmpty()) {
                    Cashbox cashbox = cashboxes.remove();
                    System.out.println(Thread.currentThread().getName() + " Obslujivaetsya v kasse "+ cashbox);
                    Thread.sleep(5L);
                    System.out.println(Thread.currentThread().getName() + " Osbobojdayu kassu "+ cashbox);
                    cashboxes.add(cashbox);
                    break;
                }else {
                    System.out.println(Thread.currentThread().getName() + " Ojivayet Svobodnuyu  kassu ");
                    Thread.sleep(5L);
                }
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
