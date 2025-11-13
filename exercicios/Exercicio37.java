package exercicios;

import java.util.Scanner;

public class Exercicio37 {

    public static void main(String[] args){

        Scanner join = new Scanner(System.in);

        int digitado;

        while (true) {

            System.out.print("Digite um valor: ");
            digitado = join.nextInt();

            if (digitado != -1) {
                System.out.println(digitado);
            } else {
                break;
            }

        }

    }


}
