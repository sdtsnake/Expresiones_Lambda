package work.oscarramos.java8.lambda;

import work.oscarramos.java8.lambda.models.Usuario;

import java.sql.SQLOutput;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class EjemploPredicate {
    public static void main(String[] args) {
        Predicate<Integer> test = nun -> nun > 10;

        boolean resultado = test.test(11);

        System.out.println("Resultado = " + resultado);

        Predicate<String> test2 = role -> role.equals("ROLE_ADMIN");
        System.out.println(test2.test("ROLE_ADMIN1"));

        BiPredicate<String,String> test3 = String::equals;
        System.out.println(test3.test("paola","paola"));

        BiPredicate<Integer,Integer> test4 = (i, j) -> j > i;
        boolean resultado2 = test4.test(5,10);
        System.out.println(resultado2);

        Usuario user1 = new Usuario();
        Usuario user2 = new Usuario();

        user1.setNombre("Carlos");
        user2.setNombre("Andres");

        BiPredicate<Usuario, Usuario> resultado3 = (ua,ub)-> ua.getNombre().equals(ub.getNombre());
        System.out.println(resultado3.test(user1, user2));
    }

}
