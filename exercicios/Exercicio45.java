package exercicios;

import java.util.Scanner;

public class Exercicio45 {

    public static void main(String[] args) {

        Scanner join = new Scanner(System.in);

        int[] lista = new int[5];

        for (int i = 0; i < lista.length; i++) {

            System.out.print("Digite valores: ");
            lista[i] = join.nextInt();
        }

        for (int valor : lista) {
            System.out.print(valor + " ");
        }



    }

}
