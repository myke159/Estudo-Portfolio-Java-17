package exercicios;

public class Exercicio68 {

    public static int calculoFatorial(int numero) {

        int resultado = 1;

        for (int i = 1; i < numero; i++) {

            resultado += resultado * i;

        }

        return resultado;

    }

    public static void main(String[] args){

        System.out.print("Resultado fatorial: ");
        System.out.println(calculoFatorial(5));

    }

}
