package exercicios;

public class Exercicio23 {

    public static void main(String[] args) {

        int numeroContador = 1;

        do {

            int numeroContadorPOS = numeroContador % 2;

            if (numeroContadorPOS == 0) {
                System.out.println(numeroContador + " É PAR");

            }

            numeroContador++;

        } while (numeroContador <= 100);

    }

}
