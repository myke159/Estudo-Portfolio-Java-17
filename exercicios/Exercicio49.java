package exercicios;

import java.util.Scanner;

public class Exercicio49 {

    public static void main(String[] args) {

        Scanner join = new Scanner(System.in);

        int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        for (int linha = 0; linha < 3; linha++) {

            for (int coluna = 0; coluna < 3; coluna++){

                System.out.print(matriz[linha][coluna] + " ");

            }

            System.out.println();

        }

    }

}
