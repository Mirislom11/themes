package lambda;

import JavaLang.Bool;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {
    public static void main(String[] args) {
        //TODO normal Java Function
        greetCustomer(new Customer("Maria", "99999"));
        //TODO this is using Consumer
        greetCustomerConsumer.accept(new Customer("Nadya", "5555"));
        //TODO this is BiConsumer
        greetCustomerConsumerV2.accept(new Customer("Nadya", "5555"), false);
    }

    static Consumer<Customer> greetCustomerConsumer = customer -> System.out.println("Hello: " + customer.customerName +
            ", thanks for registering phone number: " +
            customer.customerNumber);

    static BiConsumer<Customer, Boolean> greetCustomerConsumerV2 = (customer, isShowPhone) -> System.out.println("Hello: " + customer.customerName +
            ", thanks for registering phone number: " +
            (isShowPhone ? customer.customerNumber : "******"));
    static void greetCustomer (Customer customer) {
        System.out.println("Hello: " + customer.customerName +
                ", thanks for registering phone number: " +
                customer.customerNumber);
    }
    static class Customer {
        private final String customerName;
        private final String customerNumber;

        public Customer(String customerName, String customerNumber) {
            this.customerName = customerName;
            this.customerNumber = customerNumber;
        }
    }
}
