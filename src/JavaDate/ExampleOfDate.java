package JavaDate;

import javax.management.StandardEmitterMBean;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.*;

public class ExampleOfDate {
    public static void main(String[] args) {
        /*Date d = new Date();
        System.out.println(d);
        System.out.println(d.getDate());*/
/*        Calendar c = Calendar.getInstance();
        String [] strings = TimeZone.getAvailableIDs(4);
        for (String s : strings) {
            System.out.println(s);
        }*/
        /*TimeZone t = TimeZone.getDefault();*/
        /*System.out.println(t.inDaylightTime(d));*/

        /*Random r = new Random();
        System.out.println(r.nextInt(5));*/
/*
        Scanner s  = new Scanner(System.in);
        System.out.println(s.hasNext());
        s.close();*/

        /*LocalDateTime localDateTime1 = LocalDateTime.of(2020, 3, 15, 0, 30, 45);
        LocalDateTime localDateTime2 = LocalDateTime.of(2020, 3, 17, 13, 30, 45);

        Duration duration = Duration.between(localDateTime1, localDateTime2);
        System.out.println("duration: " + duration); // PT61H (61 Hours)

        long days = ChronoUnit.DAYS.between(localDateTime1, localDateTime2);
        System.out.println("days: " + days); // 2*/
        System.out.println(ChronoUnit.DAYS.between(LocalDate.now(), LocalDate.now()));
    }
}
