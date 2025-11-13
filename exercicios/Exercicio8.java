package exercicios;

import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        float nota1 = 5;
        float nota2 = 4;

        // Remover comentario para para inserir as notas pelo teclado
        System.out.print("Digita a nota 1: ");
        nota1 = entrada.nextInt();

        System.out.print("Digita a nota 2: ");
        nota2 = entrada.nextInt();
        // ***********************************************************

        float media = ((nota1 + nota2) / 2);
        String situacao = "";


        if (media >= 7) {
            situacao = "APROVADO";
        } else if (media >= 5) {
            situacao = "RECUPERACAO";
        } else if (media < 5) {
            situacao = "REPROVADO!";
        }


        System.out.println("Nota1: " + nota1);
        System.out.println("Nota2: " + nota2);
        System.out.println("Media: " + media);
        System.out.println("Situação: " + situacao);


        entrada.close();
    }
}
