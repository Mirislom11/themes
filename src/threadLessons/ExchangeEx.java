package threadLessons;

import javax.xml.transform.stax.StAXResult;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Exchanger;

public class ExchangeEx {
    public static void main(String[] args) {
        Exchanger<Action> exchanger = new Exchanger<>();
        List<Action> friend1Action = new ArrayList<>();
        friend1Action.add(Action.NOJNISA);
        friend1Action.add(Action.BUMAGA);
        friend1Action.add(Action.NOJNISA);

        List<Action> friend2Action = new ArrayList<>();
        friend2Action.add(Action.BUMAGA);
        friend2Action.add(Action.KAMEN);
        friend2Action.add(Action.KAMEN);

        new BestFriend("Oleg", friend1Action, exchanger);
        new BestFriend("Tima", friend2Action, exchanger);
    }
    private static class  BestFriend extends Thread {
        private String firstName;
        private List<Action> myActions;
        private Exchanger<Action> exchanger;

        public BestFriend(String firstName, List<Action> myActions, Exchanger<Action> exchanger) {
            this.firstName = firstName;
            this.myActions = myActions;
            this.exchanger = exchanger;
            this.start();
        }

        private void whoWins (Action myAction, Action friendsAction) {
            if ((myAction.equals(Action.KAMEN) && friendsAction.equals(Action.NOJNISA)) ||
                    (myAction.equals(Action.NOJNISA) && friendsAction.equals(Action.BUMAGA)) ||
                    (myAction.equals(Action.BUMAGA) && friendsAction.equals(Action.KAMEN)))
                System.out.println(this.getFirstName() + " wins");
        }
        public void run () {
            Action reply;
            for (Action myAction : myActions) {
                try {
                    reply = this.getExchanger().exchange(myAction);
                    whoWins(myAction, reply);
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public List<Action> getMyActions() {
            return myActions;
        }

        public void setMyActions(List<Action> myActions) {
            this.myActions = myActions;
        }

        public Exchanger<Action> getExchanger() {
            return exchanger;
        }

        public void setExchanger(Exchanger<Action> exchanger) {
            this.exchanger = exchanger;
        }
    }
}
enum  Action {
    KAMEN, NOJNISA, BUMAGA
}
