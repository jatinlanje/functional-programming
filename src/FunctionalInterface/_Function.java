package FunctionalInterface;

import javax.swing.*;
import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {
    public static void main(String[] args) {
        //Function takes 1 argument and produces 1 result
        System.out.println(incrementByOne(1));

        int increment = incrementByOneFunction.apply(1);
        System.out.println(increment);

        int multiply = multiplyBy10Function.apply(increment);
        System.out.println(multiply);

        //or simply we can combine two functions also
        Function<Integer, Integer> addBy1AndThenMultiplyBy10 = incrementByOneFunction.andThen(multiplyBy10Function);
        System.out.println(addBy1AndThenMultiplyBy10.apply(1));

        //BiFunction takes 2 argument and produces 1 result
        System.out.println(incrementByOneAndMultiply(4,100));

        System.out.println(incrementByOneAndMultiplyBiFunction.apply(4,100));
    }

    //regular function
    static int incrementByOne(int number){
        return number+1;
    }

    //Function represents a function that accepts one argument and produces a result
    static Function<Integer,Integer> incrementByOneFunction = number -> number+1;

    static Function<Integer,Integer> multiplyBy10Function = number -> number*10;

    //regular function
    static int incrementByOneAndMultiply(int numberToIncrementByOne, int numberToMultiplyBy){
        return (numberToIncrementByOne+1)*numberToMultiplyBy;
    }

    //BiFunction represents a function that accepts two arguments and produces a result
    static BiFunction<Integer,Integer,Integer> incrementByOneAndMultiplyBiFunction =
            (numberToIncrementByOne,numberToMultiplyBy) -> (numberToIncrementByOne+1)*numberToMultiplyBy;

}

