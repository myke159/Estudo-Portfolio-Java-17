package exercicios;


/**
*   Determine qual dos dois numero é o maior
 **/

import java.util.Scanner;


public class Exercicio3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Insira o 1º valor: ");
        int valor1 = entrada.nextInt();
        System.out.print("Insira o 2º valor: ");
        int valor2 = entrada.nextInt();


        if (valor1 > valor2) {

            System.out.println("O valor: " + valor1 + " > " + valor2);
        } else if (valor2 > valor1) {

            System.out.println("O valor: " + valor2 + " > " + valor1);
        } else {
            System.out.println("Os valores são iguais: " + valor1);
        }





//        System.out.println(valor1);
//        System.out.println(valor2);




        entrada.close();
    }

}
