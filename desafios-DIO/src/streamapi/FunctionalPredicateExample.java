package streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
/**
 * Representa uma função que aceita um argumento do tipo T e retorna um valor booleano (verdadeiro oufalso).
 * É comumente usada para filtrar os elementos do Stream com base em alguma condição.
 */
public class FunctionalPredicateExample {
    public static void main(String[] args) {
        List<String> linguagens = Arrays.asList("java", "pyhton", "kotlin", "javascript","go","ruby");
        Predicate<String> maisDeCincoCaracteres = linguagem -> linguagem.length() > 5;

        linguagens.stream()
                .filter(maisDeCincoCaracteres)
                .forEach(System.out::println);
        System.out.println("-------------------------------------");
        //segunda forma
        linguagens.stream()
                .filter(l -> l.length() > 5)
                .forEach(System.out::println);
    }
}
