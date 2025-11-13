package exercicios;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args){

        Scanner join = new Scanner(System.in);

        int diaSemana = 2;

        // Comentar para não ter que digitar
        System.out.print("Digite um numero correspondente ao dia da semana: ");
        diaSemana = join.nextInt();

        String nomeDiaSemana = "";

        switch (diaSemana) {
            case 1:
                nomeDiaSemana = "Domingo";
                break;
            case 2:
                nomeDiaSemana = "Segunda-Feira";
                break;
            case 3:
                nomeDiaSemana = "Terça-Feira";
                break;
            case 4:
                nomeDiaSemana = "Quarta-Feira";
                break;
            case 5:
                nomeDiaSemana = "Quinta-Feira";
                break;
            case 6:
                nomeDiaSemana = "Sexta-Feira";
                break;
            case 7:
                nomeDiaSemana = "Sabado";
                break;
        }

        System.out.println("Hoje é: " + nomeDiaSemana);

    join.close();
    }
}
