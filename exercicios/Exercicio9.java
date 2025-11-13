package exercicios;

import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);


        char letra = Character.toUpperCase('o');
        String vogais = "aeiou".toUpperCase();

        // Remover comentarios para para inserir a letra
        System.out.print("Digite uma letra: ");
        letra = Character.toUpperCase(entrada.next().charAt(0));

        if (letra == 'A' || letra == 'E' || letra == 'I' || letra == 'O' || letra == 'u') {
            System.out.println("Essa letra é uma vogal: " + letra);
        } else {
            System.out.println("Essa letra NÃO é uma vogal: " + letra);
        }


    }
}
