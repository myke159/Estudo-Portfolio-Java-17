package exercicios;

import java.util.Scanner;

public class Exercicio54 {

    public static void main(String[] args) {

        Scanner join = new Scanner(System.in);

        int[][] matrizOriginal = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int[][] matrizModificada = new int[3][3];


        System.out.println(matrizOriginal.length);

        System.out.println("--------------------------------");

        for (int i = matrizOriginal.length-1; i >= 0; i--) {

//            System.out.println(matrizOriginal[i][0]);

            for (int j = 0; j < matrizOriginal[0].length; j++) {

                matrizModificada[i][j] = matrizOriginal[i][j];
                System.out.print(matrizOriginal[i][j]);
            }
            System.out.println();

        }




    }

}
