package exercicios;

public class Exercicio51 {

    public static void main(String[] args) {

        // Primeiro valor, número de linhas| Segundo valor numero de colunas

        int[][] matriz = {
                {10, 10, 8},
                {10, 10, 7}
        };


        float somaTotal = 0.0F;

        for (int i = 0; i < matriz.length; i++){

            for (int j = 0; j < matriz[0].length; j++){

                somaTotal += matriz[i][j];

            }

        }

        float media = somaTotal / (matriz.length * matriz[0].length);

        System.out.println("Media: " + media);

    }

}
