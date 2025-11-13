package exercicios;

public class Exercicio41 {

    public static void main(String[] args) {

        int contadorMultiplos = 0;
        int contador = 0;

        while (true){

            contador++;

            if ((contador % 4) == 0 & contadorMultiplos < 10) {
                contadorMultiplos++;
                System.out.println(contador);
            } else if (contadorMultiplos == 10) {
                break;
            }

        }

    }

}
