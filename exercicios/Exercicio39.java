package exercicios;

import java.util.Scanner;

public class Exercicio39 {

    public static void main(String[] args) {

        Scanner join = new Scanner(System.in);

        int digitado;

        System.out.print("Digite um valor de 1 a 10: ");
        digitado = join.nextInt();

        for (int i = 1; i <= 10; i++) {

            if (i == digitado){
                continue;
            } else {
                System.out.print(i + " ");
            }

        }

        System.out.println("  |  (o " + digitado + " é ignorado!)");
        join.close();
    }

}
