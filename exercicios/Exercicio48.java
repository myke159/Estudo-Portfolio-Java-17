package exercicios;

import java.util.Scanner;

public class Exercicio48 {

    public static void main(String[] args) {

        Scanner join = new Scanner(System.in);

        int[] lista = {1, 2, 3, 4, 5};

        int[] copiaLista = new int[5];

        System.out.print("Digite o valor para multiplicar: ");
        int digitado = join.nextInt();

        for (int i = 0; i < lista.length; i++){

            copiaLista[i] = lista[i] * digitado;

        }

        for (int i = 0; i < copiaLista.length; i++) {

            System.out.println(lista[i] + " * " + digitado + " = " + copiaLista[i]);

        }


    }

}
