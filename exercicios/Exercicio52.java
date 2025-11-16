package exercicios;

public class Exercicio52 {

    public static void main(String[] args) {

        int quantidadeNumerosPares = 0;

        int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[0].length; j++){

                if (matriz[i][j] % 2 == 0){

                    quantidadeNumerosPares++;

                }

            }

        }

        System.out.println("Quantidade de pares: " + quantidadeNumerosPares);

    }

}
