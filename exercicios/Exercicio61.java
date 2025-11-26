package exercicios;

import logica.Lista;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Exercicio61 {

    public static void main(String[] args) {

        ArrayList<Integer> numeros = new ArrayList<>(Arrays.asList(10, 25, 7, 40, 13));

        Collections.sort(numeros);
        System.out.println(numeros);
        System.out.printf("""
                Maior número: %d
                Menor número: %d
                """, numeros.get(numeros.size() - 1), numeros.get(0));


        ArrayList<Integer> numerosCorridos = new ArrayList<>(Arrays.asList(8, 10, 25, 7, 40, 13));
        int maior = numerosCorridos.get(0);
        int menor = numerosCorridos.get(0);

        for (Integer numero : numerosCorridos) {
            if (numero > maior) {
                maior = numero;
            }
            if (numero < menor) {
                menor = numero;
            }
        }

        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);



    }

}
