package FunctionalInterface;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class _Predicate {
    public static void main(String[] args) {
        //normal java function
        System.out.println(isPhoneNumberVaild("911234567890"));
        System.out.println(isPhoneNumberVaild("1234567890"));

        //Predicate Functional interface
        System.out.println(isPhoneNumberVaildPredicate.test("911234567890"));
        System.out.println(isPhoneNumberVaildPredicate.test("1234567890"));

        System.out.println("Is phone number valid and contains 3 = "+isPhoneNumberVaildPredicate.and(containsNumber3).test("911234567890"));
        System.out.println("Is phone number valid and contains 3 = "+isPhoneNumberVaildPredicate.or(containsNumber3).test("911204567890"));

        //BiPredicate Functional interface
        System.out.println(isPhoneNumberVaildBiPredicate.test("911234567890","IN"));
    }

    //regular function
    static boolean isPhoneNumberVaild(String phoneNumber){
        return phoneNumber.startsWith("91") && phoneNumber.length()==12;
    }

    //Predicate represents a predicate (boolean-valued function) of one argument.
    static Predicate<String> isPhoneNumberVaildPredicate = phoneNumber -> phoneNumber.startsWith("91") && phoneNumber.length()==12;

    static Predicate<String> containsNumber3 = phoneNumber -> phoneNumber.contains("3");

    //BiPredicate represents a predicate (boolean-valued function) of two arguments.
    static BiPredicate<String,String> isPhoneNumberVaildBiPredicate = (phoneNumber,country) -> {return (phoneNumber.startsWith("91") && country.contains("IN"));};

}

