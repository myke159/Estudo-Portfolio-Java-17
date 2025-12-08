package exercicios;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Exercicio64 {

    public static void main(String[] args) {

        Scanner join = new Scanner(System.in);
        Set<String> palavras = new HashSet<>();
        int totalPalvrasDigitadas = 0;
        String entrada;

        System.out.println("=== Leia palavras ===");


        do {


            System.out.print("Digite: ");
            entrada = join.next().toLowerCase();

            if (!entrada.equals("fim")) {
                palavras.add(entrada);
                totalPalvrasDigitadas++;
            }







        } while (!entrada.equals("fim"));

        TreeSet<String> ordemPalavrasSet = new TreeSet<>(palavras);

        System.out.printf("Numero de palavras unicas digitadas: %d\n", palavras.size());
        System.out.println(palavras);
        System.out.println("--------------------------------------------------------------");
        System.out.printf("Numero total de palavras digitadas: %d\n", totalPalvrasDigitadas);
        System.out.println("--------------------------------------------------------------");
        System.out.println("Palavras em ordem crescente: ");
        System.out.println(ordemPalavrasSet);
        System.out.println("--------------------------------------------------------------");

        System.out.print("Digite uma palavra para pesquisar se existe: ");
        entrada = join.next().toLowerCase();
        if (palavras.contains(entrada)) {
            System.out.printf("Contem a palavra %S!!", entrada);
        }

    }

}
