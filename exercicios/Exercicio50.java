package exercicios;

import java.util.Scanner;

public class Exercicio50 {

    public static void main(String[] args) {

        Scanner join = new Scanner(System.in);

        int[][] tabela = new int[2][2];

        for (int i = 0; i < 2; i++){

            for (int j = 0; j < 2; j++){

                System.out.print("Digite um valor: ");
                tabela[i][j] = join.nextInt();

            }

        }

        for (int i = 0; i < 2; i++){

            for (int j = 0; j < 2; j++){

                System.out.print(tabela[i][j] + " ");

            }
            System.out.println();

        }



    }

}
