package enums;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        System.out.println(MonthOfYear.AUTUMN.name());
        for(MonthOfYear monthOfYears: MonthOfYear.values()){
            System.out.println(monthOfYears.ordinal());
        }
    }
}
