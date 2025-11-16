package exercicios;

public class Exercicio53 {

    public static void main(String[] args) {


        int[][] matriz = {
                {1, 2},
                {3, 4},
                {5, 6}
        };




        /*
                {1, 2, 3},
                {4, 5, 6},
         */

//        int[][] matrizTransposta = new int[2][3];

        for (int i = 0; i < 2; i++) {

            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[j][i] + " ");


            }

            System.out.println();


        }


    }


}
