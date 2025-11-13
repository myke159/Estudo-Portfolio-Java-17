package exercicios;

import java.util.Scanner;

public class Exercicio19 {

    public static void main(String[] args){

        Scanner join = new Scanner(System.in);

        int tabuada = 2;
        int i = 1;
        int contador = 0;

        System.out.println("Tabuada do " + tabuada);

        while (i < 12) {
            System.out.println(tabuada + " * " + contador + " = " + (tabuada*contador));
            contador++;
            i++;
        }

    }

}
