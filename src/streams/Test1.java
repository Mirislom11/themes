package streams;

import java.util.Arrays;

public class Test1 {
    public static void main(String[] args) {
        int [] arr = {5,9,3,8,1};
        int [] arrResult = Arrays.stream(arr)
                .map(element -> {
                    if (element % 3 == 0)
                        element = element/3;

                    return element;
                }).toArray();
        System.out.println(Arrays.toString(arrResult));
    }
}
