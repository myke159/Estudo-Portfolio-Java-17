package exercicios;

import java.util.Scanner;

public class Exercicio20 {
    public static void main(String[] args){

        int fatorial = 6;
        int i = 1;
        int somaFatorial = 1;


        while (i < fatorial+1){
            somaFatorial *= i;
            i++;
        }

        System.out.println("Resultado do fatorial de " + fatorial + "!" + " = " + somaFatorial);

    }
}
