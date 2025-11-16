package exercicios;

import java.util.Scanner;

public class Exercicio56 {

    public static void main(String[] args) {

        Scanner join = new Scanner(System.in);

        int procurado = 0;

        boolean statusProcurado = false;

        int[][] matriz = {
                {1, 2, 3}, // linha 0
                {4, 5, 1}, // linha 1
                {7, 1, 9}  // linha 2
        };

        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[0].length; j++) {

                if (matriz[i][j] == procurado) {
                    System.out.println(procurado + " -> Linha: " + i + " | Coluna: " + j);
                    statusProcurado = true;
                }

            }

        }

        if (!statusProcurado) {
            System.out.println("Não existe o valor [" + procurado + "] na matriz");
        }


    }






}
