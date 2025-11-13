package exercicios;

import java.util.Scanner;

public class Exercicio25 {

    public static void main(String[] args) {

        Scanner join = new Scanner(System.in);


        int digitado;


        do {
            System.out.print("Escreva um numero positivo: ");
            digitado = join.nextInt();

        } while (digitado >= 0);

    }

}
