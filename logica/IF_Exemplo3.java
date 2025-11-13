package logica;

import java.util.Scanner;

public class IF_Exemplo3 {
    public static void main(String[] args) {


        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a nota do aluno: ");
        double nota = entrada.nextDouble();

        if (nota >= 7) {
            System.out.println("Aluno aprovado");
        } else if (nota >= 5) {
            System.out.println("Aluno de recuperação");
        } else {
            System.out.println("Aluno reprovado");
        }
    }
}
