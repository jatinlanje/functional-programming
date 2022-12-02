package FunctionalInterface;

import java.util.function.Supplier;

public class _Supplier {
    public static void main(String[] args) {
        System.out.println(getDBConnectionUrl());
        System.out.println(getDBConnectionUrlSupplier.get());
    }

    //regular function
    static String getDBConnectionUrl(){
        return "jdbc:localhost:123/user";
    }

    //Supplier represents a supplier of results basically accepts nothing and returns a value
    static Supplier<String> getDBConnectionUrlSupplier = () -> "jdbc:localhost:123/user";
}

//Supplier represents a supplier of results basically accepts nothing and returns a value