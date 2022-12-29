package genericsTraining.game;

import java.time.temporal.TemporalAccessor;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Team<T extends Participant> {
    private String name;
    private List<T> participantList = new ArrayList<>();

    public Team(String name){
        this.name = name;
    }
    public void addParticipantList (T participant) {
        participantList.add(participant);
        System.out.println("V komandu dobavilsa igrok: " + ((Participant)participant).getName());
    }

    public String playList (Team<T> team) {
        String winnerName;
        Random random = new Random();
        int i = random.nextInt(2);
        if (i == 0){
            winnerName = this.name;
        }else {
            winnerName = team.name;
        }
        return winnerName;
    }
    public void showWinnerTeamName (String name){
        System.out.println("Viygrala komanda" + name);
    }
}
