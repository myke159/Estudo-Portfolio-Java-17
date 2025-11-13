package exercicios;

import java.util.Scanner;

public class Exercicio33 {

    public static void main(String[] args){

        Scanner join = new Scanner(System.in);


        float digitado = 0.0F;
        float somaDosDigitados = 0.0F;
//        int numDigitados = 0;




        for (int i = 0; i < 10; i++) {

            System.out.print("Digite o valor da " + (i+1) + " nota: ");
            digitado = join.nextInt();

            somaDosDigitados += digitado;

        }

        float media = (float) somaDosDigitados / 10;

        System.out.println("Media: " + media);

    }

}
