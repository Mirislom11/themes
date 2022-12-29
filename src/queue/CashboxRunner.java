package queue;

import javax.security.auth.callback.CallbackHandler;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CashboxRunner {

    public static void main(String[] args) {
        Queue<Cashbox> cashboxes = new ArrayDeque<>(List.of(new Cashbox(), new Cashbox()));

        List<Thread> threads =  Stream.of(
                new BuyerThread(cashboxes),
                new BuyerThread(cashboxes),
                new BuyerThread(cashboxes),
                new BuyerThread(cashboxes),
                new BuyerThread(cashboxes),
                new BuyerThread(cashboxes),
                 new BuyerThread(cashboxes),
                new BuyerThread(cashboxes), new BuyerThread(cashboxes)
        )
                .map(Thread:: new)
                .peek(Thread::start)
                .collect(Collectors.toList());
    }
}
