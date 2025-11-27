package logica;

import java.util.HashSet;
import java.util.Set;

public class Sete {

    public static void main(String[] args) {

        Set<String> frutas = new HashSet<>();
        frutas.add("Maça");
        frutas.add("banana");
        frutas.add("Laranja");
        frutas.add("Abacaxi");
        frutas.add("Maça");

        Set<String> frutasIntersecao = new HashSet<>(frutas);

        Set<String> frutas2 = new HashSet<>();
        frutas2.add("Maça");
        frutas2.add("banana");
        frutas2.add("Lanja");
        frutas2.add("Abaxi");
        frutas2.add("Ma");




        System.out.println(frutas);

        for (String fruta : frutas) {

            if (fruta.startsWith("M")) {
                System.out.println(fruta);
            }

        }

        frutasIntersecao.retainAll(frutas2); // Apenas o que possui nas duas listas fica visivel

        frutasIntersecao.removeAll(frutas); // Tudo que foi removido

        System.out.println(frutasIntersecao);



    }

}
