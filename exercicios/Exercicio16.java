package exercicios;

import java.util.Scanner;

public class Exercicio16 {

    public static void main(String[] args){

        Scanner join = new Scanner(System.in);

        float somaNotas = 0.0F;
        int numeroDeNotas = 0;

        float nota = 0.0F;

        while (true) {

            System.out.print("Digite a " + (numeroDeNotas + 1) + "ª nota: ");
            nota = join.nextFloat();


            if (nota >= 0) {
                somaNotas += nota;
                numeroDeNotas++;
            } else if (nota == -1) {

                break;
            } else {
                System.out.println("Error!");

            }
        }

        float media = (float) somaNotas / numeroDeNotas;
        System.out.println("Media: " + media);

    }

}
