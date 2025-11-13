package exercicios;

import java.util.Scanner;

public class Exercicio21 {

    public static void main(String[] args){

        int numero1 = 1;
        int numero2 = 100;

//        int contadorAtual;
        int i = 1;

        if (numero1 == 2) {
            System.out.println("Números iguais!");
        } else {

            if (numero1 < numero2) {

                while (numero1 < numero2 + 1) {
                    System.out.print(numero1 + " | ");
                    numero1++;
                }
            } else {
                while (numero2 < numero1 + 1) {
                    System.out.print(numero2 + " | ");
                    numero2++;
                }
            }
        }
    }

}
