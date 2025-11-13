package exercicios;

import java.util.Scanner;

public class Exercicio29 {

    public static void main(String[] args) {

        Scanner join = new Scanner(System.in);

        int tabuada = 4;
        int contador = 0;

        System.out.println("Tabuada do " + tabuada);
        do {
            System.out.println(tabuada + " x " + contador + " = " + (tabuada*contador));
            contador++;
        } while (contador <= 10);

    }

}
