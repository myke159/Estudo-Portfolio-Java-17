package exercicios;

import java.util.TreeSet;
import java.util.Set;
import java.util.HashSet;
import java.util.Scanner;


public class Exercicio65 {

    public static void main(String[] args) {

        Scanner join = new Scanner(System.in);
        Set<Integer> numerosLoteria = new HashSet<>();

        System.out.println("---Números loteria---");

        do {

            System.out.printf("Digite numeros para loteria de (1-60) | [%d/6]: ", numerosLoteria.size()+1);
            int entrada = join.nextInt();

            if (entrada >= 1 && entrada <= 60) {
                if (!numerosLoteria.contains(entrada)) {
                    numerosLoteria.add(entrada);
                } else {
                    System.out.println("Número já escolhido!");
                }

            } else {
                System.out.println("Número fora de escopo!");
            }





        } while (numerosLoteria.size() < 6);

        TreeSet<Integer> ordemNumeros = new TreeSet<>(numerosLoteria);


        System.out.println("Numeros escolhidos: " + ordemNumeros);

    }

}
