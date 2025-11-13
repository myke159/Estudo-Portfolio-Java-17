package exercicios;

import java.util.Scanner;

public class Exercicio26 {

    public static void main(String[] args) {

        Scanner join = new Scanner(System.in);

        double digitado;
        double somaDasNotas = 0;
        int quantidadeDeNotas = 0;
        double media = 0.0D;

        do {

            System.out.print("Digite a " + (quantidadeDeNotas + 1) + " nota: ");
            digitado = join.nextInt();

            if (digitado >= 0) {
                somaDasNotas += digitado;
                quantidadeDeNotas++;
            }


        } while (digitado >= 0);

        media = (double) somaDasNotas / quantidadeDeNotas;

        System.out.println("Media: " + media);

    }

}
