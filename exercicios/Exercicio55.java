package exercicios;

import java.util.Scanner;

public class Exercicio55 {

    public static void main(String[] args) {

        int[][] matrizA = {
                {1, 2},
                {3, 4}
        };

        int[][] matrizB = {
                {5, 6},
                {7, 8}
        };

        int[][] matrizSoma = new int[2][2];

        for (int i = 0; i < 2; i++){

            for (int j = 0; j < 2; j++) {

                matrizSoma[i][j] = matrizA[i][j] + matrizB[i][j];

            }

        }

        for (int i = 0; i < 2; i++){

            for (int j = 0; j < 2; j++) {

                System.out.print(matrizSoma[i][j] + " ");

            }
            System.out.println();

        }

    }

}
