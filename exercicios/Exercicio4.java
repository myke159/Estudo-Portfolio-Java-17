package exercicios;

/**
*   Verificar se está no intervalo de 10~100
 **/


import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {

        System.out.print("Insira um valor: ");

        Scanner entrada = new Scanner(System.in);

        int numero = entrada.nextInt();

        if (numero > 10 && numero < 100) {
            System.out.println("Está dentro do valor de 10 a 100");
        } else {
            System.out.println("Não está dentro do valor de 10 a 100");
        }


    }
}
