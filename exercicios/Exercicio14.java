package exercicios;

import java.util.Scanner;

public class Exercicio14 {

    /*
    Imprimir os números pares de 0 a 50
     */

    public static void main(String[] args){

        int i = 1;


        while (i < 51) {
            if ((i % 2) == 0) {
                System.out.println(i);
            }
            i++;
        }

    }

}
