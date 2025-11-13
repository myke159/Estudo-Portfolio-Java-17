package exercicios;

import java.util.Scanner;

public class Exercicio31 {

    public static void main(String[] args) {


        for (int i = 1; i <= 100; i++) {

            int multiplo = (i%3);

            if (multiplo == 0) {
                System.out.println(i + " é multiplo de 3!");
            }

        }

    }

}
