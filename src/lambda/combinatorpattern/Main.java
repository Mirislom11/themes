package lambda.combinatorpattern;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Customer customer = new Customer
                ("Alice",
                        "+998974102334",
                        "alice@gmail.com",
                        LocalDate.of(2000, 1, 1)
                );
                ValidationResult result = CustomerRegistrationValidator.
                isEmailValid().
                and(CustomerRegistrationValidator.isPhoneNumberValid()).
                and(CustomerRegistrationValidator.isAnAdult()).
                apply(customer);

        System.out.println(result);
    }
}
