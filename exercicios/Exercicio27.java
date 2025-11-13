package exercicios;

import java.util.Scanner;


public class Exercicio27 {

    public static void main(String[] args) {

        Scanner join = new Scanner(System.in);

        int digitado;
        int quantidadeDePositivos = 0;

        do {

            System.out.print("Digite numeros positivos e [0] para sair: ");
            digitado = join.nextInt();

            if (digitado >= 1) {
                quantidadeDePositivos++;
            }

        } while (digitado != 0);

        System.out.println("Quantidade de numeros positivos: " + quantidadeDePositivos);

    }

}
