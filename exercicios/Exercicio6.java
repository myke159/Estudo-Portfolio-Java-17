package exercicios;

/**
*   Classificar um número como positivo, negativo e zero
 **/

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");

        int numero = entrada.nextInt();

        if (numero > 0) {
            System.out.println("O número é positivo!");
        } else if (numero < 0) {
            System.out.println("O número é negativo!");
        } else {
            System.out.println("ZERO!");
        }


        entrada.close();
    }
}
