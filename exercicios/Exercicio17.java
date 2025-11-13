package exercicios;

import java.util.Scanner;

public class Exercicio17 {

    public static void main(String[] args){

        Scanner join = new Scanner(System.in);

        int quantidadeDeNumerosPares = 0;


        while (true) {

            System.out.print("Digite um numero: ");
            int numeroDigitado = join.nextInt();

            if (numeroDigitado >= 1) {
                if ((numeroDigitado % 2) == 0)
                    quantidadeDeNumerosPares++;
            } else if (numeroDigitado == 0) {

                System.out.println("Quantidade de numeros pares: " + quantidadeDeNumerosPares);
                break;
            } else {
                System.out.println("Error!");
            }

        }


//        join.close();

    }

}
