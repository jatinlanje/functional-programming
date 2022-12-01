package FunctionalInterface;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {
    public static void main(String[] args) {
        Customer maria = new Customer("Maria","0123456789");

        //normal java function
        greetCustomer(maria); //greetCustomer(new Customer("Maria","0123456789"));

        //Consumer Functional interface
        greetCustomerConsumer.accept(maria);

        //normal java function
        greetCustomerV2(maria,false);

        //BiConsumer Functional interface
        greetCustomerBiConsumer.accept(maria,false);

    }

    static class Customer{
        private final String customerName;
        private final String customerPhoneNumber;

        Customer(String customerName, String customerPhoneNumber) {
            this.customerName = customerName;
            this.customerPhoneNumber = customerPhoneNumber;
        }
    }

    //regular function
    static void greetCustomer(Customer customer){
        System.out.println("Hello " + customer.customerName + ", thanks for registering phone number " + customer.customerPhoneNumber);
    }

    //Consumer represents an operation that accepts a single input argument and returns no result
    static Consumer<Customer> greetCustomerConsumer =
            customer ->
                    System.out.println("Hello " + customer.customerName + ", thanks for registering phone number " + customer.customerPhoneNumber);

    //regular function
    static void greetCustomerV2(Customer customer, boolean showPhoneNumber) {
        System.out.println("Hello " + customer.customerName + ", thanks for registering phone number " + (showPhoneNumber ? customer.customerPhoneNumber : "**********"));
    }

    //BiConsumer represents an operation that accepts two input arguments and returns no result.
    static BiConsumer<Customer, Boolean> greetCustomerBiConsumer =
            (customer, showPhoneNumber) ->
                    System.out.println("Hello " + customer.customerName + ", thanks for registering phone number " + (showPhoneNumber ? customer.customerPhoneNumber : "**********"));

}



