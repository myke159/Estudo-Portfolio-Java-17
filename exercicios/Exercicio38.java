package exercicios;

import java.util.Scanner;

public class Exercicio38 {

    public static void main(String[] args) {

        Scanner join = new Scanner(System.in);

        float digitado;
        float somaTotal = 0;

        while (true){

            System.out.print("Digite um valor para somar: ");
            digitado = join.nextInt();

            if (digitado >= 0) {
                somaTotal += digitado;
            } else {
                break;
            }
        }

        System.out.println("Soma total: " + somaTotal);

    }

}
