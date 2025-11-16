package logica;

import java.util.Scanner;

public class Vetores_Arrays {

    public static void main(String[] args) {

        Scanner join = new Scanner(System.in);

         int[] numeros = {10, 20, 30, 40, 50};

         for (int i = 0; i < numeros.length; i++) {
             System.out.println("Pos: " + i + " -> " + numeros[i]);
         }


         int[] idades = new int[3];

         idades[0] = 18;
         idades[1] = 25;
         idades[2] = 30;


        System.out.println("Exemplo 2");
        for (int k = 0; k < idades.length; k++) {
            System.out.println("Pos: " + k + " -> " + idades[k]);
        }

        System.out.println("--------------------------------------------------------");


        int pares = 0;

        int[] numbers = new int[10];

        for (int j = 0; j < numbers.length; j++) {

            System.out.print("Digite um valor: ");
            numbers[j] = join.nextInt();

            if (numbers[j] % 2 == 0) {
                pares++;
            }
        }

        System.out.println("Numero de pares: " + pares);



    }

}
