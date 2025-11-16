package exercicios;

import java.util.Scanner;

public class Exercicio47 {

    public static void main(String[] args) {

        Scanner join = new Scanner(System.in);

        float[] medias = new float[5];

        float somaMedias = 0.0F;
        int quantidadeDeNotas = 0;

        for (int i = 0; i < medias.length; i++){

            System.out.print("Digite a " + (i+1) + "º nota: ");
            float nota = join.nextFloat();
            medias[i] = nota;
            quantidadeDeNotas++;
        }

        for (int i =0; i < medias.length; i++){

            somaMedias += medias[i];

        }

        System.out.println("Média: " + somaMedias/quantidadeDeNotas);



    }

}
