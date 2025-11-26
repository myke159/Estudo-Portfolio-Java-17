package exercicios;

import java.util.ArrayList;
import java.util.Arrays;

public class Exercicio62 {

    public static void main(String[] args) {


        ArrayList<String> nomes = new ArrayList<>(Arrays.asList("Myke", "Carlos", "Carlos", "Rodrigo"));

        ArrayList<String> nomesUnicos = new ArrayList<>();

        for (String nome : nomes) {
            if (!nomesUnicos.contains(nome)) {
                nomesUnicos.add(nome);
            }

        }

        System.out.print("Nova lista com nomes unicos: ");
        for (String nome : nomesUnicos) {

            System.out.printf("%S, ", nome);

        }

    }

}
