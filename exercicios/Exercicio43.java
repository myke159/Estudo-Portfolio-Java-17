package exercicios;

import java.util.List;
import java.util.Arrays;

public class Exercicio43 {

    public static void main(String[] args) {

        String palavra = "teste";

        String palavraMod = palavra.toLowerCase();

        List<String> listaVogais = Arrays.asList("a", "e", "i", "o", "u");

        int tamanhoPalvra = palavra.length();

        for (int i = 0; i < tamanhoPalvra; i++){

            for (String letra: listaVogais) {

                if (letra.matches(String.valueOf(palavraMod.charAt(i)))) {
                    System.out.println(letra);
                }

            }

        }

    }
}
