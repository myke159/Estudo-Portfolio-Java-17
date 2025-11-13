package exercicios;

/**
 * Cria um programa que receba um numero inteiro do usuario
 * e verifique se ele é positivo ou negativo.
**/

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um valor: ");
        int numero = entrada.nextInt();
        entrada.close();

        if (numero > 0) {
            if ((numero % 2) == 0) {
                System.out.println("O número: " + numero + " é par");
            } else {
                System.out.println("O número: " + numero + " é impar");
            }
        } else {
            System.out.println("Número menor que 0");
        }





    }
}
