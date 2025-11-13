package exercicios;

import java.util.Scanner;

public class Exercicio36 {

    public static void main(String[] args){

        Scanner join = new Scanner(System.in);

        /*
        Imprimir numeros pares de 1 até 20
        -- usar continue para não printar os impares
        -- imprimir o numero 20 tambem
         */

        for (int i = 1; i <= 20; i++){

            if ((i % 2) != 0) {
                continue;
            } else {
                System.out.println(i + " é PAR!");
            }

        }


    }


}
