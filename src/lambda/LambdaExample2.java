package lambda;

import java.util.ArrayList;
import java.util.List;

public class LambdaExample2 {

    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(3);
        integerList.add(2);
        integerList.add(11);
        integerList.add(4);
        integerList.add(6);
        integerList.add(8);
        integerList.add(9);

        SubEven subEven = (list -> {
            Integer sum = 0;
            for (Integer integer : list) {
                if (integer % 2 == 0){
                    sum +=integer;
                }
            }
            return sum;
        });

        Integer response = subEven.sumOfEven(integerList);
        System.out.println(response);
    }

}
