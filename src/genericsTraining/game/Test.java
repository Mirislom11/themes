package genericsTraining.game;

import io.Student;
import org.w3c.dom.ls.LSException;
import org.w3c.dom.stylesheets.LinkStyle;

import javax.xml.transform.sax.SAXResult;
import java.nio.file.Path;
import java.util.Collections;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Scholar scholar1 = new Scholar("Ivan", 13);
        Scholar scholar2 = new Scholar("Mariya", 12);

        Scholar scholar3 = new Scholar("Dmitriy", 12);
        Scholar scholar4 = new Scholar("Olya", 14);

        Employee employee1 = new Employee("Mirislom", 19);
        Employee employee2 = new Employee("Nikolay", 20);
        List<Scholar> scholarList =  List.of(scholar1, scholar2);
        List<Employee> employeeList = List.of(employee1, employee2);
        Team<Scholar> scholarTeam = new Team<>("Drakoni");
        scholarTeam.addParticipantList(scholar1);
        scholarTeam.addParticipantList(scholar2);

        Team<Scholar> scholarTeam2 = new Team<>("Delfini");
        scholarTeam2.addParticipantList(scholar3);
        scholarTeam2.addParticipantList(scholar4);

        String winnerName = scholarTeam.playList(scholarTeam2);
        System.out.println(winnerName);
        Team<Employee> employeeTeam = new Team<>("Rabotniki");
        employeeTeam.addParticipantList(employee1);
        employeeTeam.addParticipantList(employee2);
    }
}
