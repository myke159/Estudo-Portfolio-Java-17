package exercicios;

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args){

        /*
        Crie um programa que solicita ao usuario uma letra do alfabeto.
        O programa deve identificar se a letra digitada é uma
        vogal (a,e,i,o,u) ou uma consoante.

        A estrutura switch será usada para fazer essa verificação.
         */

        Scanner join = new Scanner(System.in);

        char letra = Character.toLowerCase('i');

        System.out.print("Escolha uma letra: ");
        letra = join.next().charAt(0);

        switch (letra) {
            case 'a':
                System.out.println("A letra " + letra + " é uma vogal");
                break;
            case 'e':
                System.out.println("A letra " + letra + " é uma vogal");
                break;
            case 'i':
                System.out.println("A letra " + letra + " é uma vogal");
                break;
            case 'o':
                System.out.println("A letra " + letra + " é uma vogal");
                break;
            case 'u':
                System.out.println("A letra " + letra + " é uma vogal");
                break;
            default:
                System.out.println("A letra " + letra + " é uma consoante!");
        }

        join.close();
    }
}
