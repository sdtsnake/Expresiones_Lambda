package work.oscarramos.java8.lambda;

import java.util.function.BiFunction;
import java.util.function.Function;

public class EjemploFunction {
    public static void main(String[] args) {

        Function<String,String> f1 = param ->"Hola que tal " + param;

        String resultado = f1.apply("hector");
        System.out.println(resultado);

        Function<String,String> f2 = String::toUpperCase;
        System.out.println(f2.apply("fernando"));

        BiFunction<String,String,String> f3 =(a,b)-> a.toUpperCase().concat(" " + b.toUpperCase());

        String resultado2 = f3.apply("Juan","Augusto");

        System.out.println(resultado2);

        BiFunction<String,String,Integer> f4 = String::compareTo;
        System.out.println(f4.apply("andres","fusto"));

        BiFunction<String,String,String> f5 = String::concat;
        System.out.println(f5.apply("juan"," pablo"));



    }
}
