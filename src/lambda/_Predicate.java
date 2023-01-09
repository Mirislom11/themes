package lambda;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class _Predicate {
    public static void main(String[] args) {
        System.out.println(isValid("+998974102334"));
        System.out.println(isValidFunctional.and(containsNumber3Functional).test("+99888033090"));
    }

    public static boolean isValid (String phoneNumber) {
        return phoneNumber.length() == 13 && phoneNumber.startsWith("+998");
    }

    public static Predicate<String> isValidFunctional = phoneNumber -> phoneNumber.length() == 13 && phoneNumber.startsWith("+998");

    public static Predicate<String> containsNumber3Functional = phoneNumber -> phoneNumber.contains("3");

}
